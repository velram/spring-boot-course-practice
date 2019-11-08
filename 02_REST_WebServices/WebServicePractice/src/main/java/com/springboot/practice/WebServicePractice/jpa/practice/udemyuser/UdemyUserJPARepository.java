package com.springboot.practice.WebServicePractice.jpa.practice.udemyuser;

import com.springboot.practice.WebServicePractice.jpa.practice.udemyuser.UdemyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UdemyUserJPARepository extends JpaRepository<UdemyUser, Integer> {

}