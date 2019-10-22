package com.practice.spring.boot.service;


import com.practice.spring.boot.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDAOService {

    private static List<UserDTO> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new UserDTO(1, "Velmurugan", new Date()));
        users.add(new UserDTO(2, "Velu", new Date()));
        users.add(new UserDTO(3, "Murugan", new Date()));
    }

    public UserDTO saveUser(UserDTO pUser){

        users.add(pUser);
        usersCount++;
        return pUser;
    }

    public List<UserDTO> findAllUsers(){
        return users;
    }

    public UserDTO findUserById(int pId){

        for(UserDTO currentUser : users){
            if(currentUser.getId() == pId){
                return  currentUser;
            }
        }

        return null;
    }

}
