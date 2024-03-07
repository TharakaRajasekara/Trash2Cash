package com.example.task158.controller;

import com.example.task158.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



        @GetMapping
        public List<User> getAllUsers() {
            return userService.getAllUsers();
        }

        @PostMapping
        public User createUser(@RequestBody User user) {
            return userService.createUser(user);
        }

        // Other CRUD operations as needed
}
