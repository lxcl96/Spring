package com.ly.spring5.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class Stu {
    //数组类型属性
    private String[] courses;

    //集合类型属性
    private List<String> list;
    private List<Course> courseList;
    //Map
    private Map<String,String> maps;
    private Map<String,Course> mapCourse;

    //set集合属性
    private Set<String> set;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setMapCourse(Map<String, Course> mapCourse) {
        this.mapCourse = mapCourse;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", courseList=" + courseList +
                ", maps=" + maps +
                ", mapCourse=" + mapCourse +
                ", set=" + set +
                '}';
    }
}
