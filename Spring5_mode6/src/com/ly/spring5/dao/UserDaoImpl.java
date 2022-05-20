package com.ly.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author : Ly
 * @Date : 2022/5/20
 * @Description :
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    //lucy 转100给mary

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money - ? where username =?;";
        int update = jdbcTemplate.update(sql, 100, "lucy");
        System.out.println("lucy - " + update);
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where username =?;";
        int update = jdbcTemplate.update(sql, 100, "mary");
        System.out.println("mary + " + update);
    }
}
