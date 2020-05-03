package com.josh.entity;

import lombok.Data;
import sun.plugin2.message.Serializer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020-04-27 10:21:00
 */
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
    private List<Account> accounts;
}
