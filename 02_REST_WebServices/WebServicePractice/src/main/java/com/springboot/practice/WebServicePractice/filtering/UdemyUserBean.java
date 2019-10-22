package com.springboot.practice.WebServicePractice.filtering;


import com.fasterxml.jackson.annotation.JsonFilter;

/**
 * To practice Dynamic filtering (Udemy lecture #39)
 * https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/8005676#overview
 */
@JsonFilter("UdemyUserFilter")
public class UdemyUserBean {

    private String userName;
    private String password;
    private String creditCardNumber;
    private String currentCourse;

    public UdemyUserBean(String userName, String password, String creditCardNumber, String currentCourse) {
        this.userName = userName;
        this.password = password;
        this.creditCardNumber = creditCardNumber;
        this.currentCourse = currentCourse;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }
}