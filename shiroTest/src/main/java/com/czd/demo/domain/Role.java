package com.czd.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 角色实体类
 *
 * @author: czd
 * @create: 2018/10/17 15:32
 */
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String roleName;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "role")
    private List<Permission> permissions;


}
