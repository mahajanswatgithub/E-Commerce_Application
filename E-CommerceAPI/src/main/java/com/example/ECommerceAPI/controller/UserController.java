package com.example.ECommerceAPI.controller;

import com.example.ECommerceAPI.model.Address;
import com.example.ECommerceAPI.model.Order;
import com.example.ECommerceAPI.model.User;
import com.example.ECommerceAPI.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("user")
    public void addUser(@RequestBody User user)
    {
        userService.addUser(user);
    }

    //get order by User id
    @GetMapping("user/id")
    public Optional<User> getUserById(@RequestParam Integer id)
    {
        return userService.getUserById(id);
    }
}
