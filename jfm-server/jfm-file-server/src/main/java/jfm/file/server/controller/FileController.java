package jfm.file.server.controller;

import jfm.common.pojo.JfmFile;
import jfm.common.response.ResponseEnum;
import jfm.common.response.ServerResponse;
import jfm.file.server.service.FileService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public ServerResponse<JfmFile> upload(@RequestParam("file") MultipartFile file, @RequestParam("fileType") String fileType) {
        JfmFile upload = fileService.upload(file, fileType);
        if (upload == null) {
            return ServerResponse.error("");
        } else {
            return ServerResponse.successResponse(upload);
        }
    }

    /**
     * 根据文件CODE 获取图片缩略图
     */
    @GetMapping("/image/thumbnail/{fileCode}")
    public void getThumbnail(@PathVariable("fileCode") String fileCode) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        byte[] thumbnail = fileService.getImageThumbnail(fileCode);
        if (thumbnail == null) {
            return;
        }
        try {
            HttpServletResponse response = servletRequestAttributes.getResponse();
            ServletOutputStream outputStream = response.getOutputStream();
            outputStream.write(thumbnail);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/video/thumbnail/{fileCode}")
    public void getVideoThumbnail(@PathVariable("fileCode") String fileCode) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        byte[] thumbnail = fileService.getVideoThumbnail(fileCode);
        if (thumbnail == null) {
            return;
        }
        try {
            HttpServletResponse response = servletRequestAttributes.getResponse();
            ServletOutputStream outputStream = response.getOutputStream();
            outputStream.write(thumbnail);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
