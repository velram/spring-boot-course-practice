package com.practice.spring.boot.controller;

import com.practice.spring.boot.dto.UserDTO;
import com.practice.spring.boot.service.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAOService userService;

    @GetMapping("/find-all-users")
    public List<UserDTO> getAllUsers(){
        return userService.findAllUsers();
    }

}
