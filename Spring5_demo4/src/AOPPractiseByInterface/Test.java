package AOPPractiseByInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
public class Test {

    @org.junit.Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOPPractiseByInterface/bean.xml");

        //是在代理类中 使用切入点表示式把代理类和被代理类关联起来
        BookDaoImpl bookDao = context.getBean("bookDaoImpl", BookDaoImpl.class);

        //手动创建  不是Spring自动创建了
//        Class<?> [] clazz = new Class[]{BookDao.class};
//        Object o = Proxy.newProxyInstance(bookDao.getClass().getClassLoader(), clazz, new BookDaoProxy(bookDao));
        bookDao.delBook();
    }
}
