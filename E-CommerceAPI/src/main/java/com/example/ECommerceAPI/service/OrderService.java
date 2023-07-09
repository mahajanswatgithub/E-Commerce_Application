package com.example.ECommerceAPI.service;

import com.example.ECommerceAPI.model.Order;
import com.example.ECommerceAPI.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;

    public void addOrder(Order order) {
        iOrderRepo.save(order);
    }

    public Optional<Order> getOrderById(Integer id) {
        return iOrderRepo.findById(id);
    }
}
