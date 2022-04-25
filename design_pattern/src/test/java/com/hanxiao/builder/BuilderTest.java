package com.hanxiao.builder;

import com.hanxiao.bulider.bean.Human;
import com.hanxiao.bulider.builder.HumanBuilder;
import com.hanxiao.bulider.builder.HumanBuilder2;
import org.junit.Test;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/25
 **/

public class BuilderTest {
    @Test
    public void test1() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1");
        stringBuffer.append("2");
        stringBuffer.append("3");
        String s = stringBuffer.toString();
        System.out.println(s);
    }

    @Test
    public void test2() {
        HumanBuilder humanBuilder = new HumanBuilder();
        humanBuilder.setHumanName("zhangsan");
        humanBuilder.setHumanAge(18);
        humanBuilder.setHumanHeight(172);
        Human human = humanBuilder.build();
        System.out.println("human = " + human);
    }

    @Test
    public void test3() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1").append("2").append("345");
        String s = stringBuffer.toString();
        System.out.println("s = " + s);
    }

    @Test
    public void test4() {
        HumanBuilder2 humanBuilder2 = new HumanBuilder2();
        Human human = humanBuilder2.setHumanName("zhangsan").setHumanAge(18).setHumanHeight(171).build();
        System.out.println("human = " + human);
    }
}
