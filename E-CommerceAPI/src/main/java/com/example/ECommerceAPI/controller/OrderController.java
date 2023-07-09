package com.example.ECommerceAPI.controller;

import com.example.ECommerceAPI.model.Address;
import com.example.ECommerceAPI.model.Order;
import com.example.ECommerceAPI.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("order")
    public void addOrder(@RequestBody Order order)
    {
        orderService.addOrder(order);
    }

    //get order by order id
    @GetMapping("order/id")
    public Optional<Order> getOrderById(@RequestParam Integer id)
    {
        return orderService.getOrderById(id);
    }
}
