package com.czd.demo.service.impl;

import com.czd.demo.service.ILoginService;
import com.czd.demo.domain.Permission;
import com.czd.demo.domain.Role;
import com.czd.demo.domain.User;
import com.czd.demo.repository.RoleRepository;
import com.czd.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 登录实现类
 *
 * @author: czd
 * @create: 2018/10/17 16:37
 */
@Service
public class LoginServiceImpl implements ILoginService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    /**
     * 添加用户
     * @param map
     * @return
     */
    @Override
    public User addUser(Map<String, Object> map) {
        User user = new User();
        user.setName(map.get("username").toString());
        user.setPassword(map.get("password").toString());
        userRepository.save(user);
        return user;
    }

    //添加角色
    @Override
    public Role addRole(Map<String, Object> map) {
        User user = userRepository.findById(Long.valueOf(map.get("userId").toString())).get();
        Role role = new Role();
        role.setRoleName(map.get("roleName").toString());
        role.setUser(user);
        Permission permission1 = new Permission();
        permission1.setPermission("create");
        permission1.setRole(role);
        Permission permission2 = new Permission();
        permission2.setPermission("update");
        permission2.setRole(role);
        List<Permission> permissions = new ArrayList<Permission>();
        permissions.add(permission1);
        permissions.add(permission2);
        role.setPermissions(permissions);
        roleRepository.save(role);
        return role;
    }

    //查询用户通过用户名
    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
}
