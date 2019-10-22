package com.springboot.practice.WebServicePractice.versioning;
/**
 * Versioning hands-on
 * Lecture #40 (Udemy - Mastering micro services with spring-boot & Spring cloud)
 * https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/8005678#overview
 */
public class PersonV2 {

    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
