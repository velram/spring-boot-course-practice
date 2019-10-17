package com.springboot.practice.springbootjpalearning.service;

import com.springboot.practice.springbootjpalearning.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserRepository {

    @Autowired
    private UserDAOService userDAOService;

    public User updateUser(){

        User sampleUser = new User("Velmurugan", "Senior developer");
        userDAOService.insertUser(sampleUser);

        return null;
    }
}
