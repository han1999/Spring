package com.hanxiao.springboot2.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/11
 **/
@Data
@Configuration
//@ConfigurationProperties(prefix = "hanxiao.db")
public class DataSourceConfig2 {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
