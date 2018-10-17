package com.czd.springbootRedis.controller;

import java.time.LocalDate;

/**
 * redis操作类
 *
 * @author: czd
 * @create: 2018/7/3 16:26
 */
public class RedisController {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date.toEpochDay());
    }
}
