package com.zp.project.service;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IAccountServiceTest extends TestCase {

    public void testFindAllAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-project.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.findAllAccount().forEach(System.out::println);
    }

    public void testFindAccountById() {
    }

    public void testSaveAccount() {
    }

    public void testUpdateAccount() {
    }

    public void testDeleteAccount() {
    }
}