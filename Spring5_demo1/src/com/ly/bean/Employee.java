package com.ly.bean;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class Employee {
    private String empName;
    private String empGender;
    //员工对应的部门
    private Dept Dep;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public void setDep(Dept dep) {
        Dep = dep;
    }

    public Dept getDep() {
        return Dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", Dep=" + Dep +
                '}';
    }
}
