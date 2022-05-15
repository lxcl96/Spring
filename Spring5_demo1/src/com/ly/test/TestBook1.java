package com.ly.test;

import com.ly.spring5.Book;
import com.ly.spring5.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description : 通过set方法注入属性
 */
public class TestBook1 {
    @Test
    public void test1() {
        //1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、创建对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void test2() {
        //1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、建立类对象 即调用构造器
        Order order = context.getBean("order", Order.class);
        System.out.println(order);

    }
}
