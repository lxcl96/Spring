package com.ly.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @FileName:JDKProxy.class
 * @Author:ly
 * @Date:2022/5/16
 * @Description:
 */
public class UserService {
    public static void main(String[] args) {
        //创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};

        /*

         方法1：使用匿名内部类（这个类就是代理对象类）
        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        })
        */

        //方法2：使用一个实现类（这个类就是代理对象类）
        UserDaoProxy o = (UserDaoProxy)Proxy.newProxyInstance(UserService.class.getClassLoader(), interfaces, new UserDaoProxy());
    }
}

class UserDaoProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}