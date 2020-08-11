package com.bluposSystem.blupos.controller;


import com.bluposSystem.blupos.model.ProductCategory;
import com.bluposSystem.blupos.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductCategoryController {
    @Autowired
    ProductCategoryRepository prodCatService;//Dependency Injection

    @PostMapping("/addProdCat")
    ProductCategory create(@RequestBody ProductCategory prodCat) {
        return prodCatService.save(prodCat);
    }

    @GetMapping("/listProdCat")
    Iterable<ProductCategory> read() {
        return prodCatService.findAll();
    }

    @PutMapping("/updProdCat")
    ProductCategory update(@RequestBody ProductCategory prodCat){
        return prodCatService.save(prodCat);
    }

    @DeleteMapping("/delProdCat/{id}")
    void delete(@PathVariable Integer id) {
        prodCatService.deleteById(id);
    }
}
