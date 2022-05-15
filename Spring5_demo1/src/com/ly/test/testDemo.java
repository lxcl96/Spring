package com.ly.test;

import com.ly.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class testDemo {
    @Test
    public void testAdd() {
        //1、加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BeanFactory context1 = new ClassPathXmlApplicationContext("bean1.xml");
        System.out.println(context);
        System.out.println(context1);
        System.out.println();
        //2、获取配置要创建的对象
        User user = context.getBean("user", User.class);
        user.add();
    }
}
