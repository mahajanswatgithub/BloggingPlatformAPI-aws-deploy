package com.example.BloggingPlatformAPI.repository;


import com.example.BloggingPlatformAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {


    User findFirstByUserEmail(String newEmail);
}
