package com.zp.ui;

import com.zp.dao.IAccountDao;
import com.zp.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 核心容器引发的问题
 *      ApplicationContext
 *          他在构建容器时，创建对象的策略是采用立即加载的方式，也就是，只要读取完配置文件马上就创建配置文件配置的对象
 *          单例模式使用
 *      BeanFactory
 *          他在构建容器时，创建对象采取的是延迟加载的方式，也就是，什么时候根据id获取对象，什么时候才真正的创建对象
 *          多例模式使用
 *
 */
public class XMLClient {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        IAccountDao accountDao = ac.getBean("accountDao", IAccountDao.class);
        System.out.println(accountService);
        System.out.println(accountDao);

//        accountService.saveAccount();
    }
}
