package com.czd.springbootRedis.model;

import lombok.Data;

import java.io.Serializable;

/**
 * user实体类
 *
 * @author: czd
 * @create: 2018/7/3 16:19
 */
@Data
public class User implements Serializable{
    private int id;

    private String name;
}
