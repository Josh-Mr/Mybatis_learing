package com.josh.dao;

import com.josh.entity.User;

import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName IUserDAO.java
 * @Description TODO
 * @createTime 2020-04-27 10:21:00
 */
public interface IUserDAO {

    List<User> findAll();
}
