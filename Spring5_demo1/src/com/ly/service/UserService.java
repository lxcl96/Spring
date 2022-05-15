package com.ly.service;

import com.ly.dao.UserDao;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class UserService {
    //创建UserDao类型属性
    private UserDao userDao;

    public void add() {
        System.out.println("service add方法.");
        userDao.update();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
