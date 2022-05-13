package com.hanxiao.springboot3.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/12
 **/
@Data
@Component
public class User {
    private String username;
    private String password;
}
