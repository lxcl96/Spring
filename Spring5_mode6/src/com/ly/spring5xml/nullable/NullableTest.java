package com.ly.spring5xml.nullable;

import org.springframework.lang.Nullable;

/**
 * @Author : Ly
 * @Date : 2022/5/21
 * @Description :
 */
public class NullableTest {
    @Nullable
    private String name;

    public NullableTest(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        NullableTest test = new NullableTest("你好");
        System.out.println(test.getName());

    }
}
