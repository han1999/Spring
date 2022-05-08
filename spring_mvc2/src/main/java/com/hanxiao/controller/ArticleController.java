package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

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

    @RequestMapping("header")
    public BaseRespVO header(@RequestHeader("Accept") String[] accept,
                             @RequestHeader("Host") String host) {
        System.out.println("host = " + host);
        return BaseRespVO.ok(accept);
    }

    @RequestMapping("cookie/value")
    public BaseRespVO cookieValue(@CookieValue("name") String name) {
        return BaseRespVO.ok(name);
    }

    @RequestMapping("session/put/{value}")
    public BaseRespVO sessionPut(@PathVariable("value") String value, HttpSession session) {
        session.setAttribute("value", value);
        return BaseRespVO.ok(value);
    }

    @RequestMapping("session/fetch")
    public BaseRespVO sessionFetch(@SessionAttribute("value") String value) {
        return BaseRespVO.ok(value);
    }
}
