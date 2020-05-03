package com.josh.mybatis.cfg;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Configuration.java
 * @Description TODO
 * @createTime 2020-04-24 14:26:00
 */
@Data
public class Configuration {
    private String driver;
    private String url;
    private String username;
    private String password;

    private Map<String,Mapper> mappers = new HashMap<>();
    public Map<String, Mapper> getMappers() {
        return mappers;
    }
    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers.putAll(mappers);//此处需要使用追加的方式
    }
}
