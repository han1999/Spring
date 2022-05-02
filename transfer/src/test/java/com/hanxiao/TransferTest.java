package com.hanxiao;

import com.hanxiao.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TransferTest {
    @Autowired
    AccountService accountService;
    @Test
    public void testTransfer() {
        accountService.transfer(1,2, 100);
    }

    @Test
    public void testTransferWithException() {
        accountService.transfer(2,1, 100);
    }
}
