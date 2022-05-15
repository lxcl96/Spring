package com.ly.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author : Ly
 * @Date : 2022/5/15
 * @Description :
 */
public class Orders implements BeanPostProcessor{
    private String oname;

    public Orders() {
        System.out.println("1、执行无参数构造，创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("2、执行set方法，为bean属性赋值");
    }


    public void initMethod() {
        System.out.println("3、执行初始化方法!");
    }

    public void destroy() {
        System.out.println("5、执行bean销毁方法!");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行bean初始化方法前调用");
        //bean就是创建出来的bean对象
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行bean初始化方法后调用");
        return bean;
    }
}
