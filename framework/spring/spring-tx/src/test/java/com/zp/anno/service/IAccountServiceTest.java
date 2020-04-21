package com.zp.anno.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IAccountServiceTest extends TestCase {

    public void testTransfer() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_anno_xml.xml");
        IAccountService accountServcie = context.getBean("accountService", IAccountService.class);
        accountServcie.transfer("aaa", "bbb", 100f);
    }
}