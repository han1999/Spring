//package com.hanxiao.springboot2.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
///**
// * @description:
// * @author: Han Xiao
// * @date: 2022/5/11
// **/
//@Configuration
//public class DataSourceConfig {
//
//    @Value("${hanxiao.db.driverClassName}")
//    private String driverClassName;
//    @Value("${hanxiao.db.url}")
//    private String url;
//    @Value("${hanxiao.db.username}")
//    private String username;
//    @Value("${hanxiao.db.password}")
//    private String password;
//
//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//
//}
