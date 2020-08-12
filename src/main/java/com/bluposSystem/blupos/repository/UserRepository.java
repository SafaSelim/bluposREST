package com.bluposSystem.blupos.repository;

import com.bluposSystem.blupos.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {

}
