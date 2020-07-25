package uy.edu.cei.micarritoservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.cei.micarritoservice.entities.Item;
import uy.edu.cei.micarritoservice.mapper.ItemMapper;

@RestController
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private ItemMapper itemMapper;

	public HomeController(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}

	// GET http://localhost:8080/
	@GetMapping("/")
	public String index() {
		logger.info("root path");
		Item item = itemMapper.fetchItemById(1L);
		return "hola mundo!!!";
	}

}
