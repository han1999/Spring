package com.hanxiao.springboot3.config;

import com.hanxiao.springboot3.bean.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/11
 **/

//@Component
@Data
@ConfigurationProperties(prefix = "hanxiao.db")
public class DataSourceProperties {
    String driverClassName;
    String url;
    //default values, after implementing setters, values will be changed
    String username = "root";
    String password="123456";

    String[] arr1;
    String[] arr2;

    List list1;
    List list2;

    Map map1;
    Map map2;

    User user1;
    User user2;






}
