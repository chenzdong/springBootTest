package com.czd.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简易处理请求
 *
 * @author: czd
 * @create: 2018/7/3 14:52
 */
@RestController
public class HiController {
    @RequestMapping("/hi")
    public String hi(){
        return "Hello World!";
    }

}
