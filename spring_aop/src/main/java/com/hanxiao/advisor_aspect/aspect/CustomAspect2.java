package com.hanxiao.advisor_aspect.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/
@Aspect
@Component
public class CustomAspect2 {

    @Pointcut("execution(* com..service..*(..))")
    public void pointcut1() {
    }


    @Before("pointcut1()")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("CustomAspect.before");

        Object proxy = joinPoint.getThis();
        Object target = joinPoint.getTarget();
        System.out.println(proxy == target);
        //proxy==target-->false
        //但是sout输出的Proxy和target地址是相同的，为什么？
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();

        System.out.println("proxy = " + proxy);
        System.out.println("target = " + target);
        System.out.println("signature = " + signature);
        Class declaringType = signature.getDeclaringType();
        String name = signature.getName();
        System.out.println("declaringType = " + declaringType);
        System.out.println("name = " + name);
        System.out.println("Arrays.toString(args) = " + Arrays.toString(args));
    }


    @After("pointcut1()")
    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("CustomAspect.after");
    }

    @Around("pointcut1()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        if ("method3".equals(proceedingJoinPoint.getSignature().getName())) {
            args[0] += "666";
        }
        System.out.println("around前半部分");
        Object proceed = proceedingJoinPoint.proceed(args);
        //afterReturning难道是在这里执行的吗？
        System.out.println("around的后半部分");
        return proceed + "888";
    }

    @AfterReturning(value = "pointcut1()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) throws Throwable {
        System.out.println("CustomAspect.afterReturning");
        System.out.println("result = " + result);
    }

    @AfterThrowing(value = "pointcut1()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) throws Throwable {
        System.out.println("CustomAspect.afterThrowing");
        System.out.println("exception = " + exception);
    }
}
