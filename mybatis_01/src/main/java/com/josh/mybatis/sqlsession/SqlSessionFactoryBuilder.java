package com.josh.mybatis.sqlsession;

import com.josh.mybatis.cfg.Configuration;
import com.josh.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.josh.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName SqlSessionFactorBuider.java
 * @Description TODO
 * @createTime 2020-04-24 16:47:00
 */
public class SqlSessionFactoryBuilder{


    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return  new DefaultSqlSessionFactory(cfg);
    }

}
