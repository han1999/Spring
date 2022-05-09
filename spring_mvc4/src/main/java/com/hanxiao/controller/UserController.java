package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import com.hanxiao.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/
@RestController
public class UserController {
    @RequestMapping("login")
    public BaseRespVO login(@Valid User user) {
        return BaseRespVO.ok(user);
    }
}
