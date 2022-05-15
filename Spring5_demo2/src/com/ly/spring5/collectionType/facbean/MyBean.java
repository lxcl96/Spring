package com.ly.spring5.collectionType.facbean;

import com.ly.spring5.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author : Ly
 * @Date : 2022/5/15
 * @Description :
 */
public class MyBean implements FactoryBean<Course>{
    @Override
    public Course getObject() throws Exception {
        //定义返回bean
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        //返回bean类型
        return null;
    }

    @Override
    public boolean isSingleton() {
        //是否为单例
        return false;
    }
}
