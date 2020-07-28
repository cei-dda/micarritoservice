package uy.edu.cei.micarritoservice.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.cei.micarritoservice.entities.Item;
import uy.edu.cei.micarritoservice.mapper.ItemMapper;

@RestController
public class ItemController {

	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
	private ItemMapper itemMapper;

	public ItemController(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}

	// http://localhost/items
	@GetMapping("/items")
	public List<Item> index() {
		return itemMapper.fetchAll();
	}
	
	// http://localhost/items/{id}
	@GetMapping("/items/{id}")
	public Item show(@PathVariable("id") Long id) {
		logger.info("root path");
		Item item = itemMapper.fetchItemById(id);
		return item;
	}
	
	@PostMapping("/items")
	public void save(@RequestBody Item item) {
		logger.info("item id {}, item description {}", item);
		itemMapper.save(item);
	}
	
	@PatchMapping("/items/{id}")
	public void update(@RequestBody Item item) {
		itemMapper.update(item);
	}
	
}
