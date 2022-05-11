package com.hanxiao.springboot.controller;

import com.hanxiao.springboot.bean.BaseRespVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/10
 **/
@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("hello")
    public BaseRespVO hello() {
        return BaseRespVO.ok("hello");
    }
}
