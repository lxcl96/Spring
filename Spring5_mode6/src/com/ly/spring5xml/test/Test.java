package com.ly.spring5xml.test;

import com.ly.spring5xml.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : Ly
 * @Date : 2022/5/20
 * @Description :
 */
public class Test {

    @org.junit.Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transerMoney();
    }
}
