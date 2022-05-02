package com.hanxiao.mybatis_in_spring.bean;

import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/

@Component
public class User {
   private Integer id;
   private String username;
   private String password;
   private Integer age;
   private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthdy() {
        return birthday;
    }

    public void setBirthdy(Date birthdy) {
        this.birthday = birthdy;
    }

    public User(Integer id, String username, String password, Integer age, Date birthdy) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.birthday = birthdy;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthdy=" + birthday +
                '}';
    }
}
