package com.czd.demo.controller;

import com.czd.demo.entity.Person;
import com.czd.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: czd
 * @create: 2018/7/9 14:39
 */
@RestController
@RequestMapping(value = "person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping(path="addPerson")
    public void addPerson(Person person){
        personRepository.save(person);
    }
    @DeleteMapping(path = "deletePerson")
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}
