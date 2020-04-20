package com.zp.aop.xml.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IAccountServiceTest extends TestCase {

    public void testSaveAccount() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_aop_xml.xml");

        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        accountService.saveAccount();
        accountService.deleteAccout();
        accountService.updateAccount(1);

    }
}