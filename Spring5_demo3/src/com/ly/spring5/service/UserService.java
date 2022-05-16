package com.ly.spring5.service;

import com.ly.spring5.dao.UserDao;
import com.ly.spring5.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author : Ly
 * @Date : 2022/5/16
 * @Description :
 */

//value可以省略不写，默认就是类名（首字母小写）
@Service(value = "userService")  //就是<bean id="" class="">
public class UserService {
    //定义dao类型属性

//    @Autowired
//    @Qualifier(value = "userDaoImplPlus")
//    private UserDao userDao;

    @Value(value = "名字哈哈哈")
    private String name;
    @Resource(name = "userDaoImplPlus")
    private UserDao userDao;

    public void add() {
        System.out.println("add 方法" + name);
        userDao.add();
    }
}
