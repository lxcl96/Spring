package com.ly.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author : Ly
 * @Date : 2022/5/16
 * @Description :
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add....");
    }
}
