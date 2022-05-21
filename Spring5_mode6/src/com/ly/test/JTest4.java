package com.ly.test;

import com.ly.spring5.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author : Ly
 * @Date : 2022/5/21
 * @Description :
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定使用的单元测试框架junit版本
@ContextConfiguration("classpath:bean1.xml") //指定配置文件路径创建配置文件类  相对于new ClassPathXmlApplicationContext("bean1.xml")
public class JTest4 {
    @Autowired
    private UserService userService; //自动注入得到userService对象  代替 new ClassPathXmlApplicationContext("bean1.xml").getBean()方法

    @Test
    public void test1() {
        userService.transerMoney();
    }
}
