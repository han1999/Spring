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
@RequestMapping("category")
@RestController
public class CategoryController {
    @RequestMapping("list")
    public BaseRespVO list(String name, Integer level, BaseParam baseParam) {
//        System.out.println("price = " + price);
        System.out.println("name = " + name);
        System.out.println("level = " + level);
        return BaseRespVO.ok(baseParam);
    }
}
