package uy.edu.cei.micarritoservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.cei.micarritoservice.entities.User;
import uy.edu.cei.micarritoservice.mapper.UserMapper;

@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private UserMapper userMapper;
	
	public UserController(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@GetMapping("/users/{id}")
	public User show(@PathVariable("id") Long id) {
		User user = this.userMapper.fetchById(id);
		return user;
	}
	
	@PostMapping("/users")
	public void save(@RequestBody User user) {
		logger.info("user id: {}", user.getId());
		this.userMapper.save(user);
		logger.info("user id: {}", user.getId());
	}
	
}
