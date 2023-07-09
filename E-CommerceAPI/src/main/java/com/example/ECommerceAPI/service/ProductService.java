package com.example.ECommerceAPI.service;

import com.example.ECommerceAPI.model.Product;
import com.example.ECommerceAPI.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public void addProduct(Product product) {
        iProductRepo.save(product);
    }

    public Iterable<Product> getProducts() {
        return iProductRepo.findAll();
    }

    public void deleteProductById(Integer id) {
        iProductRepo.deleteById(id);
    }
}
