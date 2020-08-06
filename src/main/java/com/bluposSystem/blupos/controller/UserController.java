package com.bluposSystem.blupos.controller;

import com.bluposSystem.blupos.model.Users;
import com.bluposSystem.blupos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;//Dependency Injection

    @PostMapping("/addUser")
    Users create(@RequestBody Users users) {
        return userService.save(users);
    }

    @GetMapping("/listUser")
    Iterable<Users> read() {
        return userService.findAll();
    }

    @PutMapping("/updUser")
    Users update(@RequestBody Users users){
        return userService.save(users);
    }

    @DeleteMapping("/delUser/{id}")
    void delete(@PathVariable Integer id) {
        userService.deleteById(id);
    }
}
