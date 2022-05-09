package com.hanxiao.bean;

import lombok.Data;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/8
 **/
@Data
public class UserReqBO extends BaseParam {
    private String username;
    private String password;

}
