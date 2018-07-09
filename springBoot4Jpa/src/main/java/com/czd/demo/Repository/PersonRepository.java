package com.czd.demo.repository;

import com.czd.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: czd
 * @create: 2018/7/9 15:07
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

}
