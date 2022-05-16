package com.ly.spring5;

/**
 * @FileName:UserDaoImpl.class
 * @Author:ly
 * @Date:2022/5/16
 * @Description:
 */
public class UserDaoImpl  implements UserDao{
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
