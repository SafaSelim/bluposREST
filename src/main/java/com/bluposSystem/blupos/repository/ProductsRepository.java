package com.bluposSystem.blupos.repository;

import com.bluposSystem.blupos.entities.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer> {
}
