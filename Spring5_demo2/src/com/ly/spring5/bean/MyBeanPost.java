package com.ly.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author : Ly
 * @Date : 2022/5/15
 * @Description :
 */
public class MyBeanPost implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行bean初始化方法前调用");
        //bean就是创建出来的bean对象
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行bean初始化方法后调用");
        //bean就是创建出来的bean对象
        return bean;
    }
}
