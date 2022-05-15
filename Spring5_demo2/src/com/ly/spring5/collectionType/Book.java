package com.ly.spring5.collectionType;

import java.util.List;

/**
 * @Author : Ly
 * @Date : 2022/5/14
 * @Description :
 */
public class Book {

    private List<Course> list;

    public void setList(List<Course> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
