package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息表（user\service实现类）
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }



//-----------------------------------------------------------------
@Override
public int userfindall(User user, String userName, String password) {
        int i=0;
    User usr= userDao.userfindLogin(userName);
    if(usr!=null){
        if(password.equals(usr.getPassword())){
            i=3;
            user.setUserID(usr.getUserID());
            user.setUserName(usr.getUserName());
            user.setRealName(usr.getRealName());
            user.setRoleID(usr.getRoleID());
            user.setPositionID(usr.getPositionID());
            user.setDepartmentID(usr.getDepartmentID());
        }else{
            i=2;
        }
    }else{
        i=1;
    }
    return i;
}

}
