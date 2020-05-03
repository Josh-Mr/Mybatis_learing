package com.josh.dao;

import com.josh.entity.Role;

import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName IRoleDAO.java
 * @Description TODO
 * @createTime 2020-04-27 15:13:00
 */
public interface IRoleDAO {

    List<Role> findAll();
}
