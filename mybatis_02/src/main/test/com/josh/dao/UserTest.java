package com.josh.dao;


import com.josh.dao.impl.UserDaoImpl;
import com.josh.entity.ConditionVo;
import com.josh.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.plugin.javascript.navig.LinkArray;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName UserTest.java
 * @Description TODO
 * @createTime 2020-04-20 23:05:00
 */
public class UserTest {

    private InputStream inputStream;
    private SqlSessionFactoryBuilder sqlSessionFactoryBuilder;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }
    @After
    public void destroy() throws IOException {
        // 手动提交
        sqlSession.commit();
        inputStream.close();
        sqlSession.close();
    }


    @Test
    public void UserTest1(){
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<User> userList = mapper.findAll();
        for (User u : userList){
            System.out.println("--每一个用户信息--");
            System.out.println(u.toString());
        }
    }

    /**
     * 实现类测试
     */
    @Test
    public void UserTest2(){
        UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
        List<User> all = userDao.findAll();
        for (User u : all){
            System.out.println(u);
        }
    }

    /*
    * 根据id查询用户
    * */
    @Test
    public void UserTest3(){
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        HashMap<String, Object> byId = mapper.findById(45);
        System.out.println(byId.get("username"));
    }

    @Test
    public void UserTest04(){

        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<HashMap> byUsername = mapper.findByUsername("%王%");
        for (HashMap hashMap : byUsername){
            System.out.println(hashMap.toString());
        }
    }

    @Test
    public void insertUser(){
        User user = new User();
        user.setUsername("josh");
        user.setBirthday(new Date());
        user.setAddress("GZ");
        user.setSex("男");
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        int insertBeforeData = mapper.insertUser(user);
        System.out.println("插入的主键id为"+user.getId());
    }

    @Test
    public void updateUserById(){
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        User user = new User();
        user.setUsername("关");
        user.setId(57);
        user.setBirthday(new Date());
        user.setSex("N");
        user.setAddress("GZ");
        int i = mapper.updateUserById(user);
        System.out.println(i);
    }

    @Test
    public void findBycondition(){
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        User user  = new User();
        List<User> bycondition = mapper.findBycondition(user);
        for (User u : bycondition){
            System.out.println(u);
        }
    }

    @Test
    public void findByConditionVo(){
        ConditionVo conditionVo = new ConditionVo();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(55);
        arrayList.add(57);
        arrayList.add(54);
        conditionVo.setArrayList(arrayList);
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<User> byConditionVo = mapper.findByConditionVo(conditionVo);
        for (User user: byConditionVo){
            System.out.println(user);
        }
    }
}
