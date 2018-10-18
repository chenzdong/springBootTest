package com.czd.demo.repository;

import com.czd.demo.domain.User;

/**
 * 用户相关respository
 *
 * @author: czd
 * @create: 2018/10/17 15:48
 */
public interface UserRepository extends BaseRepository<User,Long> {
    User findByName(String name);
}
