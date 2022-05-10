package com.hanxiao.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/10
 **/
@Configuration
@ConditionalOnClass(DruidDataSource.class)
public class DataSourceConfig {
    @ConditionalOnMissingBean(DataSource.class)
    @Bean
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}
