package com.zp.project.anno.service;

import com.zp.project.anno.domain.Account;

import java.util.List;

public interface IAccountService {

    List<Account> findAllAccount();

    Account findAccountById(Integer id);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer id);

}
