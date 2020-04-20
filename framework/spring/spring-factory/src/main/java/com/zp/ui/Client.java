package com.zp.ui;

import com.zp.factory.BeanFactory;
import com.zp.service.IAccountService;
import com.zp.service.impl.IAccountServiceImpl;

public class Client {
    public static void main(String[] args) {
        // IAccountService accountService = new IAccountServiceImpl();

        // 使用工厂模式   此时对象是多例模式   对象被创建多次，执行效率没有单例高
        for (int i = 0; i < 5; i++) {
            IAccountService accountService = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
        }


//        accountService.saveAccount();
    }
}
