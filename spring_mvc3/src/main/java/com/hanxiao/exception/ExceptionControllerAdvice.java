package com.hanxiao.exception;

import com.hanxiao.bean.BaseRespVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/
@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView arithmeticException() {
        return new ModelAndView("/exception.jsp");
    }

    @ExceptionHandler(SensitiveWordException.class)
    @ResponseBody
    public BaseRespVO sensitiveWordExceptionHandler() {
        return BaseRespVO.fail();
    }
}
