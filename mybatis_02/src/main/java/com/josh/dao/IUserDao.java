package com.josh.dao;

import com.josh.entity.ConditionVo;
import com.josh.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListResourceBundle;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName IUserDao.java
 * @Description TODO
 * @createTime 2020-04-20 22:46:00
 */
public interface IUserDao {

   /*
   *
   * 注解的方式
   *
   */
//    @Select("select * from user")
    List<User> findAll();

    HashMap<String,Object> findById(int id);

    List<HashMap> findByUsername(String username);

    int insertUser( User user);

    int updateUserById(User user);

    List<User> findBycondition(User user);

    List<User> findByConditionVo(ConditionVo conditionVo);
}
