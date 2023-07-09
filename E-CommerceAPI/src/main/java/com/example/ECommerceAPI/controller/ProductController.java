package com.example.ECommerceAPI.controller;

import com.example.ECommerceAPI.model.Address;
import com.example.ECommerceAPI.model.Product;
import com.example.ECommerceAPI.model.User;
import com.example.ECommerceAPI.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("product")
    public void addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
    }

    @GetMapping("Product")
    public Iterable<Product> getProducts()
    {
        return productService.getProducts();
    }

    @DeleteMapping("product/{id}")
    public void deleteProductById(@PathVariable Integer id)
    {
        productService.deleteProductById(id);
    }
}
