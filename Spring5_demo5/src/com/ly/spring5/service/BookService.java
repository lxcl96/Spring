package com.ly.spring5.service;

import com.ly.spring5.dao.BookDao;
import com.ly.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @FileName:BookService.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */
@Service
public class BookService {

    //通过属性注入dao
    @Autowired
    private BookDao bookDao;


    //添加方法
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    //单行单列查询
    public String selectScalar(Integer id) {
       return bookDao.selectScalar(id);
    }

    //单行多列查询
    public Book selectSingle(Integer id) {
        return bookDao.selectSingle(id);
    }

    //多行多列查询
    public List<Book> selectMany() {
        return bookDao.selectMany();
    }

    //多行单列查询
    public List<String> selectScalarForMany() {
        return bookDao.selectScalarForMany();
    }

    //批量更新
    public int[] batchUpdate(Book[] books) {
        return bookDao.batchUpdate(books);
    }
}
