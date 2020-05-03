package com.josh.mybatis.utils;

import com.josh.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName DataSourceUtil.java
 * @Description TODO
 * @createTime 2020-04-24 16:36:00
 */
public class DataSourceUtil {
    public static Connection getConnection(Configuration configuration) {
        try {
            Class.forName(configuration.getDriver());
            return DriverManager.getConnection(configuration.getUrl(), configuration.getUsername(), configuration.getPassword());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
