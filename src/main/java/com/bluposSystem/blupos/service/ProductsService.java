package com.bluposSystem.blupos.service;

import com.bluposSystem.blupos.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsService extends CrudRepository<Products, Integer> {
}
