package com.bluposSystem.blupos.controller;

import com.bluposSystem.blupos.entities.Products;
import com.bluposSystem.blupos.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductsController {

    @Autowired
    ProductsRepository prodService;//Dependency Injection

    @PostMapping("/addProduct")
    Products create(@RequestBody Products prod) {
        return prodService.save(prod);
    }

    @GetMapping("/listProduct")
    Iterable<Products> read() {
        return prodService.findAll();
    }

    @PutMapping("/updProduct")
    Products update(@RequestBody Products prod){
        return prodService.save(prod);
    }

    @DeleteMapping("/delProduct/{id}")
    void delete(@PathVariable Integer id) {
        prodService.deleteById(id);
    }
}
