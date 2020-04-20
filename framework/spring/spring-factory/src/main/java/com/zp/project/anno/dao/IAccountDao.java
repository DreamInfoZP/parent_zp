package com.zp.project.anno.dao;

import com.zp.project.anno.domain.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAllAccount();

    Account findAccountById(Integer id);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer id);
}
