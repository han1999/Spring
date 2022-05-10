package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/10
 **/
@RestController
public class HelloController {
    @RequestMapping("hello")
    public BaseRespVO hello() {
        return BaseRespVO.ok("hello");
    }

    @RequestMapping("goodbye")
    public BaseRespVO goodbye() {
        return BaseRespVO.ok("goodbye");
    }

    public HelloController() {
        System.out.println("HelloController.HelloController");
    }
}
