package com.ly.spring5.test;

import com.ly.spring5.entity.Book;
import com.ly.spring5.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @FileName:Test.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */
public class Test {

    @org.junit.Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook(new Book(1,"西游记","代售"));
    }

    @org.junit.Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.selectScalar(1));
    }

    @org.junit.Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.selectSingle(1));
    }

    @org.junit.Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> bookList = bookService.selectMany();

        System.out.println(bookList);
    }

    @org.junit.Test
    public void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<String> strings = bookService.selectScalarForMany();
        System.out.println(strings);
    }


    @org.junit.Test
    public void test06() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book4 = new Book(4, "444", "444");
        Book book5 = new Book(5, "555", "555");
        Book book6 = new Book(6, "666", "666");
        Book book7 = new Book(7, "777", "777");
        int[] ints = bookService.batchUpdate(new Book[]{book4, book5, book6, book7});
        System.out.println(Arrays.toString(ints));
    }


}
