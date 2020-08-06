package com.bluposSystem.blupos.controller;

import com.bluposSystem.blupos.model.Products;
import com.bluposSystem.blupos.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductsController {

    @Autowired
    ProductsService prodService;//Dependency Injection

    @PostMapping("/addProd")
    Products create(@RequestBody Products prod) {
        return prodService.save(prod);
    }

    @GetMapping("/listProd")
    Iterable<Products> read() {
        return prodService.findAll();
    }

    @PutMapping("/updProd")
    Products update(@RequestBody Products prod){
        return prodService.save(prod);
    }

    @DeleteMapping("/delProd/{id}")
    void delete(@PathVariable Integer id) {
        prodService.deleteById(id);
    }
}
