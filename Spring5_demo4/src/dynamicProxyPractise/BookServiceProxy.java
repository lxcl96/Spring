package dynamicProxyPractise;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
public class BookServiceProxy implements InvocationHandler {
    private BookService bookService;

    public BookServiceProxy(BookService bookService) {
        this.bookService = bookService;
    }

    public void check(){
        System.out.println("增加图书前 检查。。");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增强的逻辑
        check();

        //执行原来的方法 参数为原来的类实例 所以需要自己而外定义一个(一般自带有参构造器 方便调用时传递过滤)
        Object invoke = method.invoke(bookService, args);
        return invoke;
    }
}
