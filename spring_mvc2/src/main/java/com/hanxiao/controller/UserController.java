package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import com.hanxiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/5
 **/

@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {

    @RequestMapping("register2")
    public BaseRespVO register2(String username, String password, Integer age, Integer weight) {
        User user = new User(username, password, age, weight, null);
        return BaseRespVO.ok(user);
    }

    @RequestMapping("register3")
    public BaseRespVO register3(String username, String password, String[] hobbies) {
        User user = new User(username, password, null, null, hobbies);
        return BaseRespVO.ok(user);
    }

    @Autowired
    ConfigurableConversionService conversionService;

    @RequestMapping("register4")
    public BaseRespVO register4(String username, String password,
             @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
        return BaseRespVO.ok(birthday);
    }

    @RequestMapping("register5")
    public BaseRespVO register5(String username, String password,
                                Date birthday) {
        return BaseRespVO.ok(birthday);
    }


    @RequestMapping("register6")
    public BaseRespVO register6(User user) {
        return BaseRespVO.ok(user);
    }

}
