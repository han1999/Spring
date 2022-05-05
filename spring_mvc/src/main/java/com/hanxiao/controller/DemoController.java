package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/5
 **/
@Controller
@RequestMapping("user")
public class DemoController {
    @RequestMapping("login")
    @ResponseBody
    public BaseRespVO login() {
        return BaseRespVO.ok("user/login");
    }
}
