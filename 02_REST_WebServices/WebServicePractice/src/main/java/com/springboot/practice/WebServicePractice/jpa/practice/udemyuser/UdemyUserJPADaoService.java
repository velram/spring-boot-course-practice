package com.springboot.practice.WebServicePractice.jpa.practice.udemyuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UdemyUserJPADaoService {

    @Autowired
    private UdemyUserJPARepository udemyUserRepository;

    public List<UdemyUser> findAllUdemyUsers(){
        return udemyUserRepository.findAll();
    }

    public Optional<UdemyUser> findUdemyUserById(String pId){
        return udemyUserRepository.findById(pId);
    }
}