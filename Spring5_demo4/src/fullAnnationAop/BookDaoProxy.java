package fullAnnationAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Repository;

/**
 * @FileName:BookDaoProxy.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */
@Repository
@Aspect
public class BookDaoProxy {

    @Before(value = "execution(* fullAnnationAop.BookDao.delBook(..))")
    public void check() {
        System.out.println("前置通知： 图书删除前检查方法！");
    }
}
