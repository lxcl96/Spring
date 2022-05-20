package com.ly.fullAnnotation.test;

import com.ly.fullAnnotation.config.SpringConfig;
import com.ly.fullAnnotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : Ly
 * @Date : 2022/5/20
 * @Description :
 */
public class Test {

    @org.junit.Test
    public void test01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transerMoney();
    }
}
