package com.hanxiao.springboot2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

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
    String username;
    String password;
}
