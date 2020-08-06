package com.bluposSystem.blupos.service;

import com.bluposSystem.blupos.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersService extends CrudRepository<Customers,Integer> {
}
