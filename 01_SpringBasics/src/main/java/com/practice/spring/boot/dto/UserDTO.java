package com.practice.spring.boot.dto;

import java.util.Date;

public class UserDTO {

    private String name;
    private int id;
    private Date birthDate;

    public UserDTO(int pId, String pName, Date pBirthDate){
        this.id = pId;
        this.name = pName;
        this.birthDate = pBirthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
