package com.example.ECommerceAPI.service;

import com.example.ECommerceAPI.model.Address;
import com.example.ECommerceAPI.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public void addAddress(Address address) {
        iAddressRepo.save(address);
    }
}
