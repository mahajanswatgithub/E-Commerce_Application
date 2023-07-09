package com.example.ECommerceAPI.service;

import com.example.ECommerceAPI.model.User;
import com.example.ECommerceAPI.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public void addUser(User user) {
        iUserRepo.save(user);
    }

    public Optional<User> getUserById(Integer id) {
        return iUserRepo.findById(id);
    }
}
