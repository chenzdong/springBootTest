package com.czd.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 用户实体类
 *
 * @author: czd
 * @create: 2018/10/17 15:28
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String name;
    private String password;
    private String salt;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Role> roles;
}
