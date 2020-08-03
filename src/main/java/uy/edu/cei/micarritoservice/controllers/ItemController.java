package uy.edu.cei.micarritoservice.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import uy.edu.cei.micarritoservice.entities.Item;
import uy.edu.cei.micarritoservice.services.ItemService;

@RestController
public class ItemController {

	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
	private ItemService itemService;

	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	// http://localhost/items
	@GetMapping("/items")
	public List<Item> index() {
		return itemService.fetchAll();
	}

	// http://localhost/items/{id}
	@GetMapping("/items/{id}")
	public Item show(@PathVariable("id") Long id) {
		logger.info("root path");
		Item item = itemService.fetch(id);
		if (item == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "entity not found");
		}
		return item;
	}

	@PostMapping("/items")
	public void save(@RequestBody Item item) {
		logger.info("item id {}, item description {}", item.getId(), item.getDescription());
		try {
			itemService.save(item);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@PatchMapping("/items/{id}")
	public void update(@RequestBody Item item) {
		itemService.update(item);
	}

}
