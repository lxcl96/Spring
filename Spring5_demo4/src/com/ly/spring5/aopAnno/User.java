package com.ly.spring5.aopAnno;

import org.springframework.stereotype.Component;

/**
 * @FileName:User.class
 * @Author:ly
 * @Date:2022/5/18
 * @Description: 被代理类
 */

@Component
public class User {
    public void add() {

        System.out.println("User 类的 add方法");
    }
}
