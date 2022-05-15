package com.ly.bean;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class Dept {
    private String deptName;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "DeptName='" + deptName + '\'' +
                '}';
    }
}
