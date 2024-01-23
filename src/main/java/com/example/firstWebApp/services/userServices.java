package com.example.firstWebApp.services;

import com.example.firstWebApp.entities.user;
import com.example.firstWebApp.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServices {
    @Autowired
    userRepository repository;

    public user addUser(user u)
    {
        return repository.save(u);
    }
}
