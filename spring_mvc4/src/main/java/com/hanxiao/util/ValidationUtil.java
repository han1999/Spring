package com.hanxiao.util;

import com.hanxiao.bean.BaseRespVO;
import com.hanxiao.exception.MyValidationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/10
 **/

public class ValidationUtil {
    public static BaseRespVO valid(BindingResult bindingResult) {
        FieldError fieldError = bindingResult.getFieldError();
        String field = fieldError.getField();
        Object rejectedValue = fieldError.getRejectedValue();
        String defaultMessage = fieldError.getDefaultMessage();
        return BaseRespVO.fail(field + ":" + rejectedValue + ", " + defaultMessage);
    }

    public static void valid3(BindingResult bindingResult) throws MyValidationException {
        if (bindingResult.hasFieldErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            String field = fieldError.getField();
            Object rejectedValue = fieldError.getRejectedValue();
            String defaultMessage = fieldError.getDefaultMessage();

            String message = field + ":" + rejectedValue + ", " + defaultMessage;
            throw new MyValidationException(message);
        }
    }
}
