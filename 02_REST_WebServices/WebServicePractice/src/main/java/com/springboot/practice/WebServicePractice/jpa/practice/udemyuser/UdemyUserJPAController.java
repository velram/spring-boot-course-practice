package com.springboot.practice.WebServicePractice.jpa.practice.udemyuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UdemyUserJPAController {

    @Autowired
    private UdemyUserJPADaoService udemyUserDaoService;

    @GetMapping("/jpa/users")
    public List<UdemyUser> retrieveAllUdemyUsers(){
        return udemyUserDaoService.findAllUdemyUsers();
    }

    @GetMapping("/jpa/users/{id}")
    public UdemyUser retrieveAllUdemyUsers(
            @PathVariable int pId){

        Optional<UdemyUser> result = udemyUserDaoService.findUdemyUserById(String.valueOf(pId));
        if(!result.isPresent()){
            return null;
        }
        return result.get();
    }

}
