package com.zp.service.impl;

import com.zp.dao.IAccountDao;
import com.zp.dao.impl.IAccountDaoImpl;
import com.zp.factory.BeanFactory;
import com.zp.service.IAccountService;

public class IAccountServiceImpl implements IAccountService {

//    private IAccountDao accountDao = new IAccountDaoImpl();
    // 使用工厂模式
    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
