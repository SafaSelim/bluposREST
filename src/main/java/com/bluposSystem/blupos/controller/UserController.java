package com.bluposSystem.blupos.controller;

import com.bluposSystem.blupos.entities.Users;
import com.bluposSystem.blupos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;//Dependency Injection

    @PostMapping("/addUser")
    Users create(@RequestBody Users users) {
        return userRepository.save(users);
    }

    @GetMapping("/listUser")
    Iterable<Users> read() {
        return userRepository.findAll();
    }

    @PutMapping("/updUser")
    Users update(@RequestBody Users users){
        return userRepository.save(users);
    }

    @DeleteMapping("/delUser/{id}")
    void delete(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}
