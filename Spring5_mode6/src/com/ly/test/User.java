package com.ly.test;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @Author : Ly
 * @Date : 2022/5/21
 * @Description :
 */
public class User {

    @Test
    public void testGenericApplicationContext() {
        //1、创建Spring函数对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2、调用Spring函数对象的refresh()方法 把内容清空准备进行注册
        context.refresh();
        //3、注册对象
        User user1 = new User();
        System.out.println("user1=" + user1);
        context.registerBean("user",User.class,() -> user1);

        //4、回去获取到在Spring中手动注册的对象 如果注册时 没有写beanName 可以用 context.getBean(类的全路径)得到
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
