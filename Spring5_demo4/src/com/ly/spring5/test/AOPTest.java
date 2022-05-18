package com.ly.spring5.test;

import com.ly.spring5.aopAnno.User;
import com.ly.spring5.aopAnno.UserProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @FileName:AOPTest.class
 * @Author:ly
 * @Date:2022/5/18
 * @Description:
 */
public class AOPTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
