package com.ly.spring5;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class Book {
    private String bookName;
    private String author;
    private String address;
    private String email;

    public Book() {
    }

    public Book(String bookName, String author, String address, String email) {
        this.bookName = bookName;
        this.author = author;
        this.address = address;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
