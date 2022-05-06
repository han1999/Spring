package com.hanxiao.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

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

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;

    public User(String username, String password, Integer age, Integer weight, String[] hobbies) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.weight = weight;
        this.hobbies = hobbies;
    }
}
