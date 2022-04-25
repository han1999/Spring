package com.hanxiao.bulider.builder;

import com.hanxiao.bulider.bean.Human;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/25
 **/

public class HumanBuilder {
    private Human human = new Human();

    public void setHumanName(String name) {
        human.setName(name);
    }


    public void setHumanAge(Integer age) {
        human.setAge(age);
    }

    public void setHumanHeight(Integer height) {
        human.setHeight(height);
    }

    public Human build() {
        return human;
    }
}
