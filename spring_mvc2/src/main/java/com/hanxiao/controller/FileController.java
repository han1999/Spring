package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/8
 **/
@RestController
@RequestMapping("file")
public class FileController {
    @RequestMapping("upload")
    public BaseRespVO upload(MultipartFile file, String username) throws IOException {
        String originalFilename = file.getOriginalFilename();
        System.out.println("originalFilename = " + originalFilename);
        String contentType = file.getContentType();
        System.out.println("contentType = " + contentType);
        long size = file.getSize();
        System.out.println("size = " + size);
        String name = file.getName();
        System.out.println("name = " + name);
        String parent = getParentFilePath();
//        System.out.println("path = " + path);
        File destFile = new File(parent, originalFilename);
        String absolutePath = destFile.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);
        //oh my god, absolutePath = C:\Program Files\apache-tomcat-8.5.37-windows-x64\apache-tomcat-8.5.37\bin\2.jpg
        file.transferTo(destFile);
        return BaseRespVO.ok(username);
    }

    private String getParentFilePath() {
        URL url = FileController.class.getClassLoader().getResource("application.xml");
        String path = url.getPath();
        File file1= new File(path);
        String parent = file1.getParent();
        System.out.println("parent = " + parent);
        return parent;
    }

    @PostMapping("list/upload")
    public BaseRespVO listUpload(MultipartFile[] files, String username) throws IOException {
        String parentFilePath = getParentFilePath();
        for (MultipartFile file : files) {
            File destFile = new File(parentFilePath, file.getOriginalFilename());
            file.transferTo(destFile);
        }
        return BaseRespVO.ok(username);
    }
}
