package com.ly.spring5;

/**
 * @Author : Ly
 * @Date : 2022/5/13
 * @Description :
 */
public class Order {
    private String orderName;
    private String address;

    public Order(String orderName, String address) {
        this.orderName = orderName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
