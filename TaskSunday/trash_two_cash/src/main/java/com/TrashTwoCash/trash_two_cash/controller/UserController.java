package com.TrashTwoCash.trash_two_cash.controller;

import com.TrashTwoCash.trash_two_cash.dto.UserDTO;
import com.TrashTwoCash.trash_two_cash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUser() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User Deleted!";
    }
}
