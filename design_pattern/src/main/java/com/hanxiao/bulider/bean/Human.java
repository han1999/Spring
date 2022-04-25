package com.hanxiao.bulider.bean;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/25
 **/

public class Human {
   private String name;
   private Integer age;
   private Integer height;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Human(String name, Integer age, Integer height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Human() {
    }
}
