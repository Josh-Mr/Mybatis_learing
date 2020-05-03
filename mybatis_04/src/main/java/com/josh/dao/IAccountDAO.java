package com.josh.dao;

import com.josh.entity.Account;
import org.apache.ibatis.annotations.Param;

import javax.naming.Name;
import javax.security.auth.login.AccountException;
import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName IAccountDAO.java
 * @Description TODO
 * @createTime 2020-04-27 11:24:00
 */
public interface IAccountDAO {

    List<Account> findAll();

    List<Account> findByUid(@Param(value = "uid") Integer uid);
}
