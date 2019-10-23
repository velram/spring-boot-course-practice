package com.springboot.practice.WebServicePractice.jpa.practice.udemyuser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UdemyUser {

    @Id
    @GeneratedValue
    private String udemyId;

    private String userName;
    private String socialSecurityNumber;

    protected UdemyUser(){

    }

    public UdemyUser(String udemyId, String userName, String socialSecurityNumber) {
        this.udemyId = udemyId;
        this.userName = userName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getUdemyId() {
        return udemyId;
    }

    public void setUdemyId(String udemyId) {
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