package jfm.file.server.controller;

import jfm.common.pojo.JfmFile;
import jfm.common.response.ResponseEnum;
import jfm.common.response.ServerResponse;
import jfm.file.server.service.FileService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public ServerResponse<JfmFile> upload(@RequestParam("file") MultipartFile file) {
        JfmFile upload = fileService.upload(file);
        if(upload == null){
            return ServerResponse.error("");
        }else{
            return ServerResponse.successResponse(upload);
        }
    }

    /**
     * 根据文件CODE 获取图片缩略图
     */
    @GetMapping("/image/thumbnail/{fileCode}")
    public void getThumbnail(@PathVariable("fileCode") String fileCode){

    }
}
