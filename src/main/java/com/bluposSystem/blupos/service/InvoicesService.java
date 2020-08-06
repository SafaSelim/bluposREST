package com.bluposSystem.blupos.service;

import com.bluposSystem.blupos.model.Invoices;
import org.springframework.data.repository.CrudRepository;

public interface InvoicesService extends CrudRepository<Invoices,Integer> {

}
