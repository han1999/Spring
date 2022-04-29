package com.hanxiao.constructor;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/28
 **/

public class HasParamConstructorBean {
    private String param1;
    private String param2;

    public HasParamConstructorBean(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
        System.out.println("hasParamConstructor");

    }
}
