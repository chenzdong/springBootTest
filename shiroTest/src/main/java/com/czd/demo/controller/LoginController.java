package com.czd.demo.controller;

import com.czd.demo.domain.Role;
import com.czd.demo.domain.User;
import com.czd.demo.service.ILoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 登录controller
 *
 * @author: czd
 * @create: 2018/10/17 17:02
 */
@RestController
public class LoginController {
    @Autowired
    private ILoginService loginService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestBody Map map){
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                map.get("username").toString(),
                map.get("password").toString());
        //进行验证，这里可以捕获异常，然后返回对应信息
        subject.login(usernamePasswordToken);
        return "login";
    }
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    /**
     * 登出
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "logout";
    }

    /**
     * 错误信息
     * @return
     */
    @RequestMapping(value = "/error",method = RequestMethod.POST)
    public String error(){
        return "error ok!";
    }

    /**
     * 数据初始化
     * @param map
     * @return
     */
    @RequestMapping(value = "/addUser")
    public String addUser(@RequestBody Map<String,Object> map){
        User user = loginService.addUser(map);
        return "addUser is ok! \n" + user;
    }

    /**
     * 角色初始化
     * @param map
     * @return
     */
    @RequestMapping(value = "/addRole")
    public String addRole(@RequestBody Map<String,Object> map){
        Role role = loginService.addRole(map);
        return "addRole is ok! \n" + role;
    }

    /**
     * 使用注解
     * @return
     */
    @RequiresRoles("admin")
    @RequiresPermissions("create")
    @RequestMapping(value = "/create")
    public String create(){
        return "Create success!";
    }
}
