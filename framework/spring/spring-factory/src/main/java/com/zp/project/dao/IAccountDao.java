package com.zp.project.dao;

import com.zp.project.domain.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAllAccount();

    Account findAccountById(Integer id);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer id);
}
