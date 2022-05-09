package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/8
 **/
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    @ResponseBody
    public BaseRespVO login(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return BaseRespVO.ok(username);
    }
}
