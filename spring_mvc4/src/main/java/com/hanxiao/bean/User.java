package com.hanxiao.bean;

import org.hibernate.validator.constraints.Length;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/

public class User {
    @Length(min = 6, max = 10)
    private String username;
    @Length(min = 6, max = 10)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
