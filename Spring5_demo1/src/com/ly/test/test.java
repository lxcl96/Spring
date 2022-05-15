package com.ly.test;

import com.ly.bean.Dept;
import com.ly.bean.Employee;
import com.ly.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class test {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employee emp = context.getBean("emp", Employee.class);
        Employee emp1 = context.getBean("emp1", Employee.class);
        Employee emp2 = context.getBean("emp2", Employee.class);
        System.out.println(emp);
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
