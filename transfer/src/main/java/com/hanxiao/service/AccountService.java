package com.hanxiao.service;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/

public interface AccountService {
    void transfer(Integer fromId, Integer toId, Integer money);
}

