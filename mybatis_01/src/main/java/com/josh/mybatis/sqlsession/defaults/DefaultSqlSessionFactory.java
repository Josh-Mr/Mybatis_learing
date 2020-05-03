package com.josh.mybatis.sqlsession.defaults;

import com.josh.mybatis.cfg.Configuration;
import com.josh.mybatis.sqlsession.SqlSession;
import com.josh.mybatis.sqlsession.SqlSessionFactory;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName DefaultSqlSessionFactory.java
 * @Description TODO
 * @createTime 2020-04-24 16:48:00
 */
public class DefaultSqlSessionFactory  implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
