package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import com.hanxiao.exception.SensitiveWordException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/
@Controller
public class HelloController {
    @RequestMapping("hello1")
    public String hello1() {
        System.out.println("hello1");
        return "/hello.jsp";
    }

    @RequestMapping("hello2")
    @ResponseBody
    public BaseRespVO hello2() {
        System.out.println(("hello2"));
        return BaseRespVO.ok("hello2");
    }

    @RequestMapping("hello3")
    public BaseRespVO hello3(String name) throws SensitiveWordException {
        if ("hanxiao".equals(name)) {
            throw new SensitiveWordException();
        }
        int i = 1 / 0;
        return BaseRespVO.ok();
    }

}
