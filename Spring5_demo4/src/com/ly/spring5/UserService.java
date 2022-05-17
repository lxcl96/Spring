package com.ly.spring5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

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

        UserDaoImpl userDao = new UserDaoImpl();
        //方法2：使用一个实现类（这个类就是代理对象类，代理对象可以转换成接口UserDao）  ====》看看康师傅的动态代理
        //返回的 代理对象的类型 实际运行类型就是UserDaoImpl（编译类型为：代理类Proxy类型）即要增强的类类型，而UserDaoImpl（编译类型为：代理类Proxy类型）里面是代理对象类型即UserDaoProxy包装而来，而UserDaoProxy又是由UserDAo包装而来的

        /*
            ***总结：代理类型就是将 ”要增强的类类型UserDaoImpl（通过newProxyInstance参数传递进去userDao）“，”经过包装成代理类UserDaoProxy类型（即增加了要增强的方法）“，
         ”然后把UserDaoProxy类型的对象再转换成代理总父类Proxy类型（编译类型为：代理类Proxy类型，运行类型为：要增强的类类型UserDaoImpl）“，”最后为了通用性就把返回类型改成了Object类型“

         //**造的是代理类，所以不能用被代理类UserDaoImpl接收 否则代理类和被代理类就是同一类型了。返回的是代理类，只是代理类也实现了UserDaoImpl所实现的接口，但不是同一类型所以用其父UserDao接收（多态）。
         */

        System.out.println(userDao.getClass().getClassLoader() == userDao.getClass().getClassLoader());

        //得到将生成的代理对象类$Proxy0.class文件  看看结构就明白了
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true"); //jdk1.8之前用
        //System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");//jdk1.8之后用
        //如果强转成UserDaoImpl会报错，因为代理类和被代理类类型不相同 只是实现了相同的接口
        UserDao dao = (UserDao)Proxy.newProxyInstance(UserService.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println(dao.getClass());

        Field[] declaredFields = dao.getClass().getDeclaredFields();
        System.out.println("代理实际运行为 class com.sun.proxy.$Proxy0 有字段：");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("代理实际运行为 class com.sun.proxy.$Proxy0 有方法：" );
        Method[] declaredMethods = dao.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("===================================================");

        //调用增强方法
        int add = dao.add(1, 2);
        System.out.println(add);

    }
}

class UserDaoProxy implements InvocationHandler {

    //把需要增强的类传递过来，即UserDaoImpl类，因为要增强的就是它
    private UserDaoImpl userDao;
    //方法1 有参构造器传递，指定增强哪个类（如果为了通用，UserDaoImpl可以改成Object）
    public UserDaoProxy(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    /**
     * @param proxy 代理对象
     * @param method 表示当前需要增强的方法，如add
     * @param args 表示传递的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        //比如想增强UserDaoImpl中的add 方法，即：在调用add方法前 输出add方法前逻辑
        System.out.println("add方法前逻辑，当前方法名为：" + method.getName() + ",参数为：" + Arrays.toString(args));

        //需要被增强的方法 即UserDaoImpl中的add方法 (对象就是传递过来的UserDaoImpl对象，参数就是args)
        Object res = method.invoke(userDao, args);


        //比如想增强UserDaoImpl中的add 方法，即：在调用add方法后 输出add方法后逻辑
        System.out.println("add方法后逻辑，当前方法名为：" + method.getName() + ",参数为：" + Arrays.toString(args));
        //返回原方法的返回值，或者自己额外处理的
        return res;
    }
}