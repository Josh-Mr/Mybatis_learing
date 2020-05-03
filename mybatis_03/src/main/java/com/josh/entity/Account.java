package com.josh.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Account.java
 * @Description TODO
 * @createTime 2020-04-27 11:25:00
 */
@Data
public class Account implements Serializable {
    private int id;
    private int uid;
    private Double money;
    private User user;
}
