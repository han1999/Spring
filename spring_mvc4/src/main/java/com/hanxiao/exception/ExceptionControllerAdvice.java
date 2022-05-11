package com.hanxiao.exception;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/10
 **/
@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(MyValidationException.class)
    public BaseRespVO myValidationException(MyValidationException ex) {
        String message = ex.getMessage();
        return BaseRespVO.fail(message);
    }
}
