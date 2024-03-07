package com.example.task158.service.IMPL;

import com.example.task158.entity.Address;
import com.example.task158.repository.AddressRepository;
import com.example.task158.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceIMPL implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    // Other methods for address management
}
