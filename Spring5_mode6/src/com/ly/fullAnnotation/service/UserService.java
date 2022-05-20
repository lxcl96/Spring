package com.ly.fullAnnotation.service;

import com.ly.fullAnnotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : Ly
 * @Date : 2022/5/20
 * @Description : 用户转账
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public void transerMoney() {
        //1、开启事务
        //try {
            //2、进行业务操作
            userDao.reduceMoney();
            int i = 1 / 0;
            userDao.addMoney();
            //3、没有异常事务提交
        //} catch (Exception e) {
            //3、如果出现异常，进行事务回滚
        //}

    }

}
