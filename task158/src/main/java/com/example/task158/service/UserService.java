package com.example.task158.service;

import com.example.task158.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    User createUser(User user);
}
