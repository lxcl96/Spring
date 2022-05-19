package annotationPractise;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
public class test {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationPractise/bean.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService);
    }


    @Test
    public void test02(){
        //ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScanClass.class);
        ApplicationContext context = new AnnotationConfigApplicationContext("annotationPractise");

        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService);
    }

}
