package dynamicProxyPractise;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
public class test {

    @Test
    public void test01(){
        BookService bookService = new BookServiceImpl();
        Class [] clazz = new Class[]{BookService.class};
        BookService bookService1 = (BookService)Proxy.newProxyInstance(bookService.getClass().getClassLoader(), clazz, new BookServiceProxy(bookService));
        bookService1.addBook();
    }
}
