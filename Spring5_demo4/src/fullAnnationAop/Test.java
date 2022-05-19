package fullAnnationAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @FileName:Test.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */
public class Test {

    @org.junit.Test
    public void test01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProxyConfig.class);

        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.delBook("三国演义");
    }
}
