package com.zp.project.anno.service;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zp.project.service.IAccountService;

public class IAccountServiceTest extends TestCase {

    public void testFindAllAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-project.xml");
        com.zp.project.service.IAccountService as = (IAccountService) ac.getBean("accountService", IAccountService.class);
        as.findAllAccount().forEach(System.out::println);
    }
}