package uy.edu.cei.micarritoservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.cei.micarritoservice.entities.User;
import uy.edu.cei.micarritoservice.mapper.UserMapper;

@RestController
public class UserController {

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
		this.userMapper.save(user);
	}
	
}
