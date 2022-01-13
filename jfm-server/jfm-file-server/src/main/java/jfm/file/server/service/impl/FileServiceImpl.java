
package jfm.file.server.service.impl;

import jfm.common.pojo.JfmFile;
import jfm.common.utils.DateUtil;
import jfm.file.server.dao.FileDao;
import jfm.file.server.emum.FilePathEnum;
import jfm.file.server.service.FileService;
import net.coobird.thumbnailator.Thumbnails;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.Buffer;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileDao fileDao;


    @Override
    public JfmFile upload(MultipartFile file, String fileType) {
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID().toString();
        if (originalFilename.contains(".")) {
            fileName = fileName + originalFilename.substring(originalFilename.lastIndexOf("."));
        }
        try {
            FilePathEnum pathEnum = FilePathEnum.getFileType(fileType);
            File filePath = new File(new File(pathEnum.getPath()).getAbsolutePath() + "/" + fileName);
            file.transferTo(filePath);
            int seqFileId = fileDao.getSeqFileId();
            JfmFile jfmFile = new JfmFile();
            jfmFile.setFileCode(String.valueOf(seqFileId));
            jfmFile.setFileName(fileName);
            jfmFile.setFileOriginalName(originalFilename);
            jfmFile.setFileType(pathEnum.getFileType());
            jfmFile.setSize(file.getSize());
            jfmFile.setUploadUser("SYSTEM");
            jfmFile.setUploadDate(DateUtil.getCurrentDate());
            jfmFile.setUploadTime(DateUtil.getCurrentTime());
            jfmFile.setPath(pathEnum.getPath() + "/" + fileName);
            fileDao.insertFile(jfmFile);
            return jfmFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 图片压缩 等比例压缩
     */
    @Override
    public byte[] getImageThumbnail(String fileCode) {
        try {
            JfmFile jfmFile = fileDao.selectOne(fileCode);
            if (jfmFile == null) {
                return null;
            }
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            File file = new File(FilePathEnum.IMAGE_ORIGIN.getPath() + "/" + jfmFile.getFileName());
            float scale = 1f;
            if (file.length() > 1024 * 200) {
                scale = (float) (1024 * 200) / (float) file.length();
            }
            Thumbnails.of(file).size(400, 300).toOutputStream(outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] getVideoThumbnail(String fileCode) {
        JfmFile jfmFile = fileDao.selectOne(fileCode);
        if (jfmFile == null) {
            return null;
        }
        try {
            FFmpegFrameGrabber ff = new FFmpegFrameGrabber(FilePathEnum.VIDEO_ORIGIN.getPath() + "/" + jfmFile.getFileName());
            ff.start();
            Frame frame = null;
            for (int i = 0; i < 5; i++) {
                frame = ff.grabImage();
            }
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            BufferedImage convert = new Java2DFrameConverter().convert(frame);
            ImageIO.write(convert,"png",outputStream);
            ff.stop();
            ByteArrayOutputStream resultOut = new ByteArrayOutputStream();
            Thumbnails.of(new ByteArrayInputStream(outputStream.toByteArray())).size(400, 300).toOutputStream(resultOut);
            return resultOut.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
