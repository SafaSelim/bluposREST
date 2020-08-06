package com.bluposSystem.blupos.service;

import com.bluposSystem.blupos.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface ProductCategoryService extends CrudRepository<ProductCategory,Integer> {
}
