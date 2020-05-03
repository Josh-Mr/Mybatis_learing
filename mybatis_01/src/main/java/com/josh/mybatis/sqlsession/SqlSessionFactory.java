package com.josh.mybatis.sqlsession;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName SqlSessionFactory.java
 * @Description TODO
 * @createTime 2020-04-24 16:46:00
 */
public interface  SqlSessionFactory {
    SqlSession openSession();
}
