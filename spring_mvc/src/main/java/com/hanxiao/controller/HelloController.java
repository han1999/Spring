package com.hanxiao.controller;

import com.hanxiao.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/4
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello/view")
    public ModelAndView view() {
        ModelAndView modelAndView = new ModelAndView("/hello.jsp");
        modelAndView.addObject("name", "hanxiao");
        return modelAndView;
    }

    @RequestMapping("/hello/json")
    @ResponseBody
    public User json() {
        return new User("hanxiao", "123456");
    }
}
