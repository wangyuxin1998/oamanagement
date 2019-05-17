package com.example.demo.service;

import com.example.demo.entity.User;


public interface UserService {
    //登录|查询
    int userfindall(User user, String userName, String password);
}
