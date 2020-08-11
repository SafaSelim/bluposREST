package com.bluposSystem.blupos.repository;

import com.bluposSystem.blupos.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {

}
