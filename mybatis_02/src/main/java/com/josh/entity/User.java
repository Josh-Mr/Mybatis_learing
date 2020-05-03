package com.josh.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020-04-20 22:47:00
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

}
