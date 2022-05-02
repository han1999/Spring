package com.hanxiao;

import com.hanxiao.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/2
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TransactionProxyFactoryBeanTest {

    @Autowired
    @Qualifier("accountServiceProxy")
    AccountService accountService;

    @Test
    public void testProxy() {
        accountService.transfer(1,2,1000);
    }
}
