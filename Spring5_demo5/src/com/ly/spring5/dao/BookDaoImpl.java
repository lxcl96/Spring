package com.ly.spring5.dao;

import com.ly.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName:BookDaoImpl.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */
@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        String sql = "insert into t_book values (?,?,?)";
        int update = jdbcTemplate.update(sql, book.getBook_id(), book.getBook_name(), book.getBook_status());
        System.out.println("更新影响行数=" + update);
    }

    @Override
    public String selectScalar(Integer id) {
        String sql = "select book_name from t_book where book_id=?";
        return jdbcTemplate.queryForObject(sql, String.class, id);
    }

    @Override
    public Book selectSingle(Integer id) {
        String sql = "select * from t_book where book_id=?";
        //和apache工具类似 包装一个Bean
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<>(Book.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<Book> selectMany() {
        String sql = "select * from t_book";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
    }

    @Override
    public List<String> selectScalarForMany() {
        String sql = "select book_name from t_book";
        return jdbcTemplate.queryForList(sql,String.class);
    }

    @Override
    public int[] batchUpdate(Book[] books) {
        String sql = "insert into t_book values(?,?,?)";
        List<Object[]> list = new ArrayList<>();
        for (Book book : books) {
            list.add(new Object[]{book.getBook_id(),book.getBook_name(),book.getBook_status()});
        }
        return jdbcTemplate.batchUpdate(sql,list);
    }
}
