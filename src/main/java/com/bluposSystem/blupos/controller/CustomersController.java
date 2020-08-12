package com.bluposSystem.blupos.controller;

import com.bluposSystem.blupos.entities.Customers;
import com.bluposSystem.blupos.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class CustomersController {

    @Autowired
    CustomersRepository custService;//Dependency Injection

    @PostMapping("/addCust")
    Customers create(@RequestBody Customers cust) {
        return custService.save(cust);
    }

    @GetMapping("/listCust")
    Iterable<Customers> read() {
        return custService.findAll();
    }

    @PutMapping("/updCust")
    Customers update(@RequestBody Customers cust){
        return custService.save(cust);
    }

    @DeleteMapping("/delCust/{id}")
    void delete(@PathVariable Integer id) {
        custService.deleteById(id);
    }
}
