package com.ly.spring5.dao;

import com.ly.spring5.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @FileName:BookDao.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */
@Repository
public interface BookDao {
    void addBook(Book book);

    String selectScalar(Integer id);

    Book selectSingle(Integer id);

    List<Book> selectMany();

    List<String> selectScalarForMany();

    int[] batchUpdate(Book[] books);
}
