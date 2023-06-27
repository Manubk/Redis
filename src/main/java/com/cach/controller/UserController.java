package com.cach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cach.entity.User;
import com.cach.repo.UserRepo;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	
	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		System.out.println(user.toString());
		User save = userRepo.save(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
		
	@GetMapping("/users")
	public ResponseEntity<Iterable<User>> getAllUsers(){
		Iterable<User> users = userRepo.findAll();
		return ResponseEntity.ok()
				.body(users);
	}
}
