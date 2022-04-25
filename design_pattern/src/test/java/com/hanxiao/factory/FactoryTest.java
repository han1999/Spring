package com.hanxiao.factory;

import com.hanxiao.factory.bean.BydCar;
import com.hanxiao.factory.bean.Car;
import com.hanxiao.factory.factory.CarFactory;
import org.junit.Test;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class FactoryTest {
    @Test
    public void testFactory() {
        CarFactory carFactory = new CarFactory();
        Car bydCar = carFactory.createCar("BydCar");
        System.out.println(bydCar instanceof BydCar);
    }
}
