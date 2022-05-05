package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import com.hanxiao.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/5
 **/
@RestController
@RequestMapping("user2")
public class DemoController4 {
    @RequestMapping("login")
    @ResponseBody
    public BaseRespVO login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username, password);
        return BaseRespVO.ok(user);
    }
}
