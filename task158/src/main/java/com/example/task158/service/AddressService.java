package com.example.task158.service;

import com.example.task158.entity.Address;
import com.example.task158.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AddressService {

    List<Address> getAllAddresses();

    Address createAddress(Address address);
}
