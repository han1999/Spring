package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import com.hanxiao.bean.UserReqBO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/8
 **/
@RestController
@RequestMapping("json")
public class JsonController {

    @RequestMapping("login")
    public BaseRespVO login(@RequestBody UserReqBO userReqBO) {
        return BaseRespVO.ok(userReqBO);
    }

    @RequestMapping("login2")
    public BaseRespVO login2(@RequestBody Map map) {
        Object username = map.get("username");
        Object password = map.get("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return BaseRespVO.ok(map);
    }
}
