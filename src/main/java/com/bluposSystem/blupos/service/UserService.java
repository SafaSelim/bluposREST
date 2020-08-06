package com.bluposSystem.blupos.service;

import com.bluposSystem.blupos.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserService extends CrudRepository<Users, Integer> {

}
