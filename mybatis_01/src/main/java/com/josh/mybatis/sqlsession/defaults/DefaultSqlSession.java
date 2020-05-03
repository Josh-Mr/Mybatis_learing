package com.josh.mybatis.sqlsession.defaults;

import com.josh.mybatis.cfg.Configuration;
import com.josh.mybatis.sqlsession.SqlSession;
import com.josh.mybatis.sqlsession.proxy.MapperProxy;
import com.josh.mybatis.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName DefaultSqlSessionFactoryBuilder.java
 * @Description TODO
 * @createTime 2020-04-24 16:49:00
 */
public class DefaultSqlSession implements SqlSession {

    private Configuration cfg;
    private Connection connection;

    public DefaultSqlSession(Configuration cfg) {
        this.cfg = cfg;
        connection = DataSourceUtil.getConnection(cfg);
    }

    /**
     * 用于创建代理对象
     *
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    @Override
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},
                new MapperProxy(cfg.getMappers(), connection));
    }

    /**
     * 用于释放资源
     */
    @Override
    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}