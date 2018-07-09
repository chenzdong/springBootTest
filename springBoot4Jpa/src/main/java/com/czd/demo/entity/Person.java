package com.czd.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * person实体类
 *
 * @author: czd
 * @create: 2018/7/9 14:35
 */
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="name",nullable = true,length = 20)
    private String name;
    @Column(name="age",nullable = true,length = 4)
    private int age;
}
