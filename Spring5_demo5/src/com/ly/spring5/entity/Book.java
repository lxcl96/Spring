package com.ly.spring5.entity;

/**
 * @FileName:User.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description: 实体类
 */
public class Book {
    private Integer book_id;
    private String book_name;
    private String book_status;

    public Book() {
    }

    public Book(Integer book_id, String book_name, String book_status) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_status = book_status;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_status() {
        return book_status;
    }

    public void setBook_status(String book_status) {
        this.book_status = book_status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_status='" + book_status + '\'' +
                '}';
    }
}
