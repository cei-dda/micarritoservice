package uy.edu.cei.micarritoservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.cei.micarritoservice.entities.Category;
import uy.edu.cei.micarritoservice.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

	private CategoryService categoryService;
	
	public CategoriesController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping
	public List<Category> index() {
		return this.categoryService.fetchAll();
	}
	
	@PostMapping
	public void save() {
		
	}
	
}
