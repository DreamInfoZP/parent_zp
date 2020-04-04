package com.zp.dao;

import com.zp.domain.User;

import java.util.List;

/**
 * @author zhoupeng
 */
public interface IUserDao {
    List<User> findAll();
}
