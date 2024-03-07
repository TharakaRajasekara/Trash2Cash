package com.example.task158.controller;

import com.example.task158.entity.Address;
import com.example.task158.service.AddressService;
import com.example.task158.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class Addresscontroller {
    private final AddressService addressService;

    public Addresscontroller(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    // Other CRUD operations as needed
}
