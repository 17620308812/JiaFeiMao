
package jfm.file.server.service;

import jfm.common.pojo.JfmFile;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    JfmFile upload(MultipartFile file);
}
