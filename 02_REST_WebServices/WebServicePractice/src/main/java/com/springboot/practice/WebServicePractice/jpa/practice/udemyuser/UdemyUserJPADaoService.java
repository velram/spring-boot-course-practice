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

    public Optional<UdemyUser> findUdemyUserById(int pId){
        return udemyUserRepository.findById(pId);
    }

    public void deleteById(int pId) {
        udemyUserRepository.deleteById(pId);
    }

    public List<Post> findPostsByUser(int pId) throws UdemyUserNotFoundException {
        Optional<UdemyUser> userOptional = findUdemyUserById(pId);
        if(!userOptional.isPresent()){
            //return new UdemyUserNotFoundException("User is not found with id : "+pId);
            throw new UdemyUserNotFoundException("User is not found with id : "+pId);
        }

        return userOptional.get().getPosts();
    }
}