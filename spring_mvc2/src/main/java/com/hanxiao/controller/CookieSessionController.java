package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/8
 **/
@RestController
public class CookieSessionController {
    @RequestMapping("cookie")
    public BaseRespVO cookie(HttpServletRequest httpServletRequest) {
        Cookie[] cookies = httpServletRequest.getCookies();
        return BaseRespVO.ok(cookies);
    }

    @RequestMapping("put/data")
    public BaseRespVO putData(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("username", "hanxiao");
//        return BaseRespVO.ok(session);
        return BaseRespVO.ok();
    }

    @RequestMapping("fetch/data")
    public BaseRespVO fetchData(HttpSession session) {
//        return BaseRespVO.ok(session);
        Object username = session.getAttribute("username");
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("username", (String) username);
        return BaseRespVO.ok(stringStringHashMap);
    }
}
