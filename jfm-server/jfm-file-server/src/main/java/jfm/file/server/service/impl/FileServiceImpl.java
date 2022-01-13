
package jfm.file.server.service.impl;

import jfm.common.pojo.JfmFile;
import jfm.common.utils.DateUtil;
import jfm.file.server.dao.FileDao;
import jfm.file.server.emum.FilePathEnum;
import jfm.file.server.service.FileService;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileDao fileDao;


    @Override
    public JfmFile upload(MultipartFile file) {
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID().toString();
        if (originalFilename.contains(".")) {
            fileName = fileName + originalFilename.substring(originalFilename.lastIndexOf("."));
        }
        try {
            File filePath = new File(new File("static").getAbsolutePath() + "/" + fileName);
            file.transferTo(filePath);
            int seqFileId = fileDao.getSeqFileId();
            JfmFile jfmFile = new JfmFile();
            jfmFile.setFileCode(String.valueOf(seqFileId));
            jfmFile.setFileName(fileName);
            jfmFile.setFileOriginalName(originalFilename);
            jfmFile.setUploadUser("SYSTEM");
            jfmFile.setUploadDate(DateUtil.getCurrentDate());
            jfmFile.setUploadTime(DateUtil.getCurrentTime());
            jfmFile.setPath(filePath.getAbsolutePath());
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
    public byte[] getThumbnail(String fileCode) {
        try {
            JfmFile jfmFile = fileDao.selectOne(fileCode);
            if (jfmFile == null) {
                return null;
            }
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            File file = new File(FilePathEnum.IMAGE_ORIGIN.getPath() + "/" + jfmFile.getFileName());
            float scale = 1f;
            if (file.length() > 1024 * 200) {

            }
            Thumbnails.of(file).scale(scale).toOutputStream(outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
