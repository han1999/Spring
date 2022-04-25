package com.hanxiao.bulider.builder;

import com.hanxiao.bulider.bean.Human;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/25
 **/

public class HumanBuilder2 {
    Human human = new Human();

    public HumanBuilder2 setHumanName(String name) {
        human.setName(name);
        return this;
    }


    public HumanBuilder2 setHumanAge(int i) {
        human.setAge(i);
        return this;
    }

    public HumanBuilder2 setHumanHeight(Integer height) {
        human.setHeight(height);
        return this;
    }

    public Human build() {
        return human;
    }
}
