package com.bluposSystem.blupos.controller;


import com.bluposSystem.blupos.model.ProductUnit;
import com.bluposSystem.blupos.repository.ProductUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductUnitController {
    @Autowired
    ProductUnitRepository prodUnitService;//Dependency Injection

    @PostMapping("/addProdUnit")
    ProductUnit create(@RequestBody ProductUnit prodUnit) {
        return prodUnitService.save(prodUnit);
    }

    @GetMapping("/listProdUnit")
    Iterable<ProductUnit> read() {
        return prodUnitService.findAll();
    }

    @PutMapping("/updProdUnit")
    ProductUnit update(@RequestBody ProductUnit prodUnit){
        return prodUnitService.save(prodUnit);
    }

    @DeleteMapping("/delProdUnit/{id}")
    void delete(@PathVariable Integer id) {
        prodUnitService.deleteById(id);
    }
}
