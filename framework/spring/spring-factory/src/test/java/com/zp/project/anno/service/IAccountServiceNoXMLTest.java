package com.zp.project.anno.service;

import com.zp.config.SpringConfiguration;
import com.zp.project.anno.service.impl.IAccountServiceImpl;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IAccountServiceNoXMLTest extends TestCase {

    public void testFindAllAccount() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.findAllAccount().forEach(System.out::println);
    }
}