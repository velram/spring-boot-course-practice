package com.springboot.practice.WebServicePractice.jpa.practice.udemyuser;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UdemyUser {

    @Id
    @GeneratedValue//(generator="system-uuid")
    //@GenericGenerator(name="system-uuid", strategy = "uuid") // To generate id as string
    private Integer udemyId;

    private String userName;
    private String socialSecurityNumber;

    protected UdemyUser(){

    }

    public UdemyUser(String userName, String socialSecurityNumber) {

        this.userName = userName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Integer getUdemyId() {
        return udemyId;
    }

    public void setUdemyId(Integer udemyId) {
        this.udemyId = udemyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}