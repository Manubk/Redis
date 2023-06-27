package com.cach.entity;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@RedisHash(value = "user")
@Data
public class User  implements Serializable{
	
	private int id;
	
	private String name;
}
