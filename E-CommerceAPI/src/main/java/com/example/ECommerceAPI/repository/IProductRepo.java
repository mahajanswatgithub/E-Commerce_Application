package com.example.ECommerceAPI.repository;

import com.example.ECommerceAPI.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
}
