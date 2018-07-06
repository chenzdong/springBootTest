package com.czd.springBoot4Rabbitmq.entityMessage;

import lombok.Data;

import java.io.Serializable;

/**
 * 实体类
 *
 * @author: czd
 * @create: 2018/7/6 14:38
 */
@Data
public class User implements Serializable{
    private String name;
    private int id;
    public User(int id,String name){
        this.id=id;
        this.name=name;
    }
}
