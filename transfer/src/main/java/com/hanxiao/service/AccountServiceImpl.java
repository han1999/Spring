package com.hanxiao.service;

import com.hanxiao.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Autowired
    TransactionTemplate transactionTemplate;

    @Override
    public void transfer(Integer fromId, Integer toId, Integer money) {
        Integer fromMoney = accountMapper.selectMoneyById(fromId);
        Integer toMoney = accountMapper.selectMoneyById(toId);
        fromMoney -= money;
        toMoney += money;

        Integer finalFromMoney = fromMoney;
        Integer finalToMoney = toMoney;
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                accountMapper.updateMoneyById(finalFromMoney, fromId);
                int i = 1 / 0;
                accountMapper.updateMoneyById(finalToMoney, toId);
                return null;
            }
        });
    }
}
