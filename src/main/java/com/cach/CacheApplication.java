package com.cach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}
	

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisFactory = new JedisConnectionFactory();
//		jedisFactory.setHostName(null);
//		jedisFactory.setPassword(null);
//		jedisFactory.setPort(0);
		return jedisFactory;
	}
	
	@Bean
	RedisTemplate<String, Object> redisTemplet(){
		RedisTemplate<String,Object> redisTem = new RedisTemplate<>();
		redisTem.setConnectionFactory(jedisConnectionFactory());
		return redisTem;
	}

}
