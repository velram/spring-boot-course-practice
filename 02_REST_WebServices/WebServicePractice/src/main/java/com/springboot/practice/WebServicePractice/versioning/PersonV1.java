package com.springboot.practice.WebServicePractice.versioning;
/**
 * Versioning hands-on
 * Lecture #40 (Udemy - Mastering micro services with spring-boot & Spring cloud)
 * https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/8005678#overview
 */
public class PersonV1 {

    private String firstName;
    private String lastName;

    public PersonV1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
