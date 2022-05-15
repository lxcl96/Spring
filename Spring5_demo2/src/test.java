import com.ly.spring5.autowire.Emp;
import com.ly.spring5.bean.Orders;
import com.ly.spring5.collectionType.Book;
import com.ly.spring5.collectionType.Course;
import com.ly.spring5.collectionType.Stu;
import com.ly.spring5.collectionType.facbean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class test {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);

        Course course = new Course();
        course.setCname("太阳");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course);

        System.out.println(book);
        System.out.println(book1);
        book.setList(courses);
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
    }

    //FactoryBean 与 普通bean对比
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }

    @Test
    public void test4() {
        //IOC容器操作Bean 之 bean生命周期
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        //System.out.println(orders);
        System.out.println("4、使用对象！");


        //手动销毁bean才会调用destroy方法
        ((ClassPathXmlApplicationContext)context).close();
    }


    @Test
    //自动注入/装配
    public void test5() {
        //IOC容器操作Bean 之 bean生命周期
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

    }
}
