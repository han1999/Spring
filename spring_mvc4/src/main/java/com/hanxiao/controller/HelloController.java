package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/
@RestController
public class HelloController {
    @RequestMapping("hello")
    public BaseRespVO hello(Locale locale) {
        return BaseRespVO.ok(locale);
    }
}
