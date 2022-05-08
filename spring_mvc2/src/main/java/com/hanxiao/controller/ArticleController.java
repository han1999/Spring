package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/8
 **/
@RestController
public class ArticleController {
    @RequestMapping("{username}/article/details/{id}")
    public BaseRespVO articleDetails(@PathVariable("username") String username,
                                     @PathVariable("id") Integer id) {
        return BaseRespVO.ok(username + id);
    }

    @RequestMapping("login")
    public BaseRespVO login(@RequestParam("username") String name,
                            @RequestParam("password") String pwd) {
        return BaseRespVO.ok(name + pwd);
    }
}
