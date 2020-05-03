package com.josh.mybatis.io;
import java.io.InputStream;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName resources.java
 * @Description TODO
 * @createTime 2020-04-24 14:47:00
 */
public class Resources {

    /**
     * 传入一个参数，获得一个字节输入流
     * @param filePath
     * @return
     */

    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
