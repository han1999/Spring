package com.hanxiao.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/
@Component("customAdvice")
public class CustomAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("学姐好！");
        Object proceed = invocation.proceed();
        System.out.println("学姐再见！");
        return proceed;
    }
}
