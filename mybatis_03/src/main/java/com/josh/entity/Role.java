package com.josh.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Role.java
 * @Description TODO
 * @createTime 2020-04-27 15:14:00
 */
@Data
public class Role {
    private int id;
    private String roleName;
    private String roleDesc;
    private List<User> users;
}
