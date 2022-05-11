package com.hanxiao.controller;

import com.hanxiao.bean.BaseRespVO;
import com.hanxiao.bean.User;
import com.hanxiao.exception.MyValidationException;
import com.hanxiao.util.ValidationUtil;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/
@RestController
public class UserController {
    @RequestMapping("login")
    public BaseRespVO login(@Valid User user) {
        return BaseRespVO.ok(user);
    }

    @RequestMapping("register")
    public BaseRespVO register(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            String field = fieldError.getField();
            Object rejectedValue = fieldError.getRejectedValue();
            String defaultMessage = fieldError.getDefaultMessage();
            return BaseRespVO.fail(field + ":" + rejectedValue + ", " + defaultMessage);
        }
        return BaseRespVO.ok(user);
    }

    @RequestMapping("register2")
    public BaseRespVO register2(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ValidationUtil.valid(bindingResult);
        }
        return BaseRespVO.ok(user);
    }

    @RequestMapping("register3")
    public BaseRespVO register3(@Valid User user, BindingResult bindingResult) throws MyValidationException {
        ValidationUtil.valid3(bindingResult);
        return BaseRespVO.ok(user);
    }
}
