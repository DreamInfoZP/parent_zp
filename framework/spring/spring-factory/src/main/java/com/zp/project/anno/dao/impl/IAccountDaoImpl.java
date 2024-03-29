package com.zp.project.anno.dao.impl;

import com.zp.project.anno.dao.IAccountDao;
import com.zp.project.anno.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public class IAccountDaoImpl implements IAccountDao {

    @Autowired
    private QueryRunner query;

    @Override
    public List<Account> findAllAccount() {
        try {
            return query.query("select * from account", new BeanListHandler<>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Account findAccountById(Integer id) {
        try {
            return query.query("select * from account where id = ?", new BeanHandler<>(Account.class), id);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void saveAccount(Account account) {
        try {
            query.update("insert into account(name,money) values(?,?)", account.getName(), account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            query.update("update account set name = ? , money = ? where id = ?", account.getName(), account.getMoney(), account.getId());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void deleteAccount(Integer id) {
        try {
            query.execute("delete form account where id = ?", id);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
