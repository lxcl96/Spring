package com.ly.spring5.collectionType;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class Course {
    private String cname;

    public void setCname(String name) {
        this.cname = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
