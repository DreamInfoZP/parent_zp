package com.zp.aop.anno.service.impl;

import com.zp.aop.anno.service.IAccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class IAccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("执行了保存方法");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("执行了更新方法" + i);
    }

    @Override
    public int deleteAccout() {
        System.out.println("执行了删除方法方法");
        return 0;
    }
}
