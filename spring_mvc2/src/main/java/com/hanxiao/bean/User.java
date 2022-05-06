package com.hanxiao.bean;

import lombok.Data;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/5
 **/
@Data
public class User {
    private String username;
    private String password;
    private Integer age;
    private Integer weight;
    private String[] hobbies;

    public User(String username, String password, Integer age, Integer weight, String[] hobbies) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.weight = weight;
        this.hobbies = hobbies;
    }
}
