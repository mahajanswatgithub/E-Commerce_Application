package com.example.ECommerceAPI.repository;

import com.example.ECommerceAPI.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order,Integer> {
}
