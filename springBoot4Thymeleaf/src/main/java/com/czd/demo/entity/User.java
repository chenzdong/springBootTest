package com.czd.demo.entity;

import lombok.Data;

/**
 * @author: czd
 * @create: 2018/7/16 15:36
 */
@Data
public class User {
    private int id;
    private String name;
    private int age;
    private String address;

    public User(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
