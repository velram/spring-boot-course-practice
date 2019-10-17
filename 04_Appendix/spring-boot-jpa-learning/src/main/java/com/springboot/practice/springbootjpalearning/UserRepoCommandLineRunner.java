package com.springboot.practice.springbootjpalearning;

import com.springboot.practice.springbootjpalearning.entity.User;
import com.springboot.practice.springbootjpalearning.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class UserRepoCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User sampleUser = new User("Velu", "SSE");
        userRepository.save(sampleUser);
    }
}
