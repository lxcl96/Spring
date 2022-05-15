package com.ly.spring5.autowire;

/**
 * @Author : Ly
 * @Date : 2022/5/15
 * @Description :
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
