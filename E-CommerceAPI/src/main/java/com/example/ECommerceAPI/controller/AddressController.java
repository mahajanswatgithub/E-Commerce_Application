package com.example.ECommerceAPI.controller;

import com.example.ECommerceAPI.model.Address;
import com.example.ECommerceAPI.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
    @PostMapping("address")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }

}
