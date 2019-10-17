package com.springboot.practice.springbootjpalearning;

import com.springboot.practice.springbootjpalearning.entity.User;
import com.springboot.practice.springbootjpalearning.service.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User sampleUser = new User("Velmurugan","Senior Software Engineer");
        long userId = userDAOService.insertUser(sampleUser);
        System.out.println("User ID : "+userId);
    }
}
