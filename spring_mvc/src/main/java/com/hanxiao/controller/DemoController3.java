package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/5
 **/
@RestController
public class DemoController3 {
    @RequestMapping("json")
    public BaseRespVO json() {
        return BaseRespVO.ok("json");
    }
}
