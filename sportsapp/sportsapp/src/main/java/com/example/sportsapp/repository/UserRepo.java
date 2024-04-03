package com.example.sportsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sportsapp.model.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    
}