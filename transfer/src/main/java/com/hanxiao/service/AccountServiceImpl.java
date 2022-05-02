package com.hanxiao.service;

import com.hanxiao.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public void transfer(Integer fromId, Integer toId, Integer money) {
        Integer fromMoney = accountMapper.selectMoneyById(fromId);
        Integer toMoney = accountMapper.selectMoneyById(toId);
        fromMoney -= money;
        toMoney += money;
        accountMapper.updateMoneyById(fromMoney, fromId);
        accountMapper.updateMoneyById(toMoney, toId);

    }
}
