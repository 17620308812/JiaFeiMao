package jfm.file.server.controller;

import jfm.common.pojo.JfmFile;
import jfm.common.response.ResponseEnum;
import jfm.common.response.ServerResponse;
import jfm.file.server.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping("/upload")
    public ServerResponse<JfmFile> upload(@RequestParam("file") MultipartFile file) {
        JfmFile upload = fileService.upload(file);
        if(upload == null){
            return ServerResponse.error("");
        }else{
            return ServerResponse.successResponse(upload);
        }
    }
}
