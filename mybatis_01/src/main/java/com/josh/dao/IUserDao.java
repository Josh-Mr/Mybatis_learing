package com.josh.dao;

import com.josh.entity.User;
import com.josh.mybatis.annotion.Select;

import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName IUserDao.java
 * @Description TODO
 * @createTime 2020-04-24 11:44:00
 */
public interface IUserDao {
    /**
     * 查询所有
     * 配置注解
     * @return
     */
    @Select("select * from user")
    public List<User> findAll() ;
}

