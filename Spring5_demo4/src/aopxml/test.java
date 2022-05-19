package aopxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @FileName:test.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */
public class test {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopxml/bean.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.delBook("红楼梦");
    }
}
