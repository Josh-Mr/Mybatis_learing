package com.josh.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName User.java
 * @Description 用到lomlok通过@Data注解
 * @createTime 2020-04-24 11:45:00
 */
@Data
public class User implements Serializable {
    private Integer  id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
