package com.springboot.practice.springbootjpalearning.service;

import com.springboot.practice.springbootjpalearning.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insertUser(User pUser){
        long userId = 1L;
        entityManager.persist(pUser);
        return pUser.getId();
    }

}
