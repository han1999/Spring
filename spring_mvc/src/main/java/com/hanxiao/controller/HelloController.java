package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import com.hanxiao.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping({"hello1", "hello2", "hello3"})
    @ResponseBody
    public BaseRespVO hello() {
        return BaseRespVO.ok("hello");
    }


    @RequestMapping("goodbye*")
    @ResponseBody
    public BaseRespVO goodbye1() {
        return BaseRespVO.ok("goodbye*");
    }

    @RequestMapping("goodbye/*")
    @ResponseBody
    public BaseRespVO goodbye2() {
        return BaseRespVO.ok("goodbye/*");
    }

    @RequestMapping(value = "method/get", method = RequestMethod.GET)
    @ResponseBody
    public BaseRespVO methodGet() {
        return BaseRespVO.ok("get");
    }

    @RequestMapping(value = "method/post", method = RequestMethod.POST)
    @ResponseBody
    public BaseRespVO methodPost() {
        return BaseRespVO.ok("post");
    }

    @GetMapping("method/get1")
    @ResponseBody
    public BaseRespVO methodGet1() {
        return BaseRespVO.ok("get1");
    }

    @PostMapping("method/post1")
    @ResponseBody
    public BaseRespVO methodPost1() {
        return BaseRespVO.ok("post1");
    }

    @RequestMapping(value = "method/double", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public BaseRespVO methodDouble() {
        return BaseRespVO.ok("double");
    }

    @RequestMapping(value = "login", params = "username")
    @ResponseBody
    public BaseRespVO login() {
        return BaseRespVO.ok("login");
    }

    @RequestMapping(value = "login2", params = {"username", "password"})
    @ResponseBody
    public BaseRespVO login2() {
        return BaseRespVO.ok("login2");
    }
}
