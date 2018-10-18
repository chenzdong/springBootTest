package com.czd.demo.service;

import com.czd.demo.domain.Role;
import com.czd.demo.domain.User;

import java.util.Map;

/**
 * 登录相关service
 *
 * @author: czd
 * @create: 2018/10/17 15:56
 */
public interface ILoginService {
    User findByName(String name);
    User addUser(Map<String, Object> map);
    Role addRole(Map<String, Object> map);
}
