package com.czd.demo.controller;

import com.czd.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: czd
 * @create: 2018/7/16 15:34
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{id}")
    public String getUset(@PathVariable int id,Model model) {
        model.addAttribute("user",new User(id,"jack",20,"china"));
        return "/user/detail";
    }

    @RequestMapping("/list")
    public String listUser(Model model) {
        List<User> userList=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            userList.add(new User(i,"tom",20+i,"russia"));
        }
        model.addAttribute("users",userList);
        return "/user/list";
    }
}
