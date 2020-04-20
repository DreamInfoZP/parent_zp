package com.zp.xml.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IAccountServiceTest extends TestCase {

    public void testFindAccountById() {
    }

    public void testTransfer() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_tx_xml.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        accountService.transfer("aaa", "bbb", 100f);
    }
}