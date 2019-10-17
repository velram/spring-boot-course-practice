package com.springboot.practice.springbootjpalearning.service;

import com.springboot.practice.springbootjpalearning.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
