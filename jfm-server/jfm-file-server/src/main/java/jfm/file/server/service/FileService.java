
package jfm.file.server.service;

import jfm.common.pojo.JfmFile;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    JfmFile upload(MultipartFile file,String fileType);

    /**
     * 图片压缩 等比例压缩
     */
    byte[] getImageThumbnail(String fileCode);

    /**
     *
     */
    byte[] getVideoThumbnail(String fileCode);
}
