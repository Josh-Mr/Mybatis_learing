package com.josh.dao.impl;

import com.josh.dao.IUserDao;
import com.josh.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName UserDaoImpl.java
 * @Description TODO
 * @createTime 2020-04-21 22:41:00
 * 可以自定义实现接口，最好不要实现
 */
//implements IUserDao
public class UserDaoImpl  {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl (SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }
    public List<User> findAll() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> objects = sqlSession.selectList("com.josh.dao.IUserDao.findAll");

        sqlSession.close();
        return objects;
    }
}
