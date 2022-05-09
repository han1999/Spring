package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/
@RestController
public class HelloController {
    @RequestMapping("hello")
    public BaseRespVO hello(Locale locale) {
        return BaseRespVO.ok(locale);
    }

    @Autowired
    @Qualifier("messageSource")
    MessageSource messageSource;

    @RequestMapping("hello1/{key}")
    public BaseRespVO hello1(Locale locale, @PathVariable String key, String[] strings) {
        String message = messageSource.getMessage(key, strings, locale);
        return BaseRespVO.ok(message);
    }

    @RequestMapping("valid")
    public BaseRespVO valid(HttpServletRequest request) {
        String username = request.getParameter("username");
        if (username == null || username.length()<7) {
            return BaseRespVO.fail("用户名过短");
        }
        String password = request.getParameter("password");
        if (password == null || password.length() < 7) {
            return BaseRespVO.fail("密码过短");
        }
        return BaseRespVO.ok(username + ":" + password);
    }
}
