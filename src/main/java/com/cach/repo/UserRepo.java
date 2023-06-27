package com.cach.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cach.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
