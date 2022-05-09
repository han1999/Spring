package com.hanxiao.controller;

import com.hanxiao.bean.BaseParam;
import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/8
 **/
@RequestMapping("order")
@RestController
public class OrderController {
    @RequestMapping("list")
    public BaseRespVO list(Double price, BaseParam baseParam) {
        System.out.println("price = " + price);
        return BaseRespVO.ok(baseParam);
    }
}
