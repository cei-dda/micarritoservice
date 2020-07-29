package uy.edu.cei.micarritoservice.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uy.edu.cei.micarritoservice.entities.User;
import uy.edu.cei.micarritoservice.mapper.UserMapper;

class UserControllerTest {

	@Test
	void test() {
		UserMapper mock = new UserMapper() {
			@Override
			public User fetchById(Long id) {
				User user = new User();
				user.setId(123L);
				return user;
			}
		};
		
		UserController controller = new UserController(mock);
		User user = controller.show(123L);
		assertEquals(123L, user.getId());
	}

}
