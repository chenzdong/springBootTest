package com.czd.demo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * 权限实体类
 *
 * @author: czd
 * @create: 2018/10/17 15:36
 */
@Data
@Entity
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String permission;
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

}
