package com.hanxiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/5
 **/
@Controller
public class DemoController2 {

    @RequestMapping("view1")
    public ModelAndView view1() {
        ModelAndView modelAndView = new ModelAndView("/view.jsp");
        modelAndView.addObject("name", "hanxiao");
        return modelAndView;
    }

    @RequestMapping("view2")
    public String view2(Model model) {
        model.addAttribute("name", "zhangsan");
        return "/view.jsp";
    }
}
