package com.bluposSystem.blupos.controller;

import com.bluposSystem.blupos.entities.Invoices;
import com.bluposSystem.blupos.repository.InvoicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class InvoicesController {

    @Autowired
    InvoicesRepository invService;//Dependency Injection

    @PostMapping("/addInv")
    Invoices create(@RequestBody Invoices inv) {
        return invService.save(inv);
    }

    @GetMapping("/listInv")
    Iterable<Invoices> read() {
        return invService.findAll();
    }

    @PutMapping("/updInv")
    Invoices update(@RequestBody Invoices inv){
        return invService.save(inv);
    }

    @DeleteMapping("/delInv/{id}")
    void delete(@PathVariable Integer id) {
        invService.deleteById(id);
    }
}
