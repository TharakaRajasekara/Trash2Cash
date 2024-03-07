package com.example.task158.repository;

import com.example.task158.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface AddressRepository extends JpaRepository<Address, Long> {
}
