package com.hanxiao.factory.bean;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/28
 **/

public class User {
    @Override
    public String toString() {
        return "User{" +
                "fromFactory='" + fromFactory + '\'' +
                '}';
    }

    private String fromFactory;

    public String getFromFactory() {
        return fromFactory;
    }

    public void setFromFactory(String fromFactory) {
        this.fromFactory = fromFactory;
    }
}
