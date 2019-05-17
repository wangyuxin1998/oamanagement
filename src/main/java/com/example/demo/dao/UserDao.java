package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/*
用户信息表(User)
 */
public interface UserDao {
    //登录|查询
    User userfindLogin(@Param("userName") String userName);
}
