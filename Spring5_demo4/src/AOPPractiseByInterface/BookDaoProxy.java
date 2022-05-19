package AOPPractiseByInterface;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
@Component
@Aspect
public class BookDaoProxy{
    private BookDaoImpl bookDao;

    public BookDaoProxy(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }

    @Before(value = "execution(* AOPPractiseByInterface.BookDaoImpl.delBook(..))")
    public void check(){
        System.out.println("开始检查");
    }

}
