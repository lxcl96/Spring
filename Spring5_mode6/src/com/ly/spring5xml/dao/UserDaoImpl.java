package com.ly.spring5xml.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author : Ly
 * @Date : 2022/5/20
 * @Description :
 */

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

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
