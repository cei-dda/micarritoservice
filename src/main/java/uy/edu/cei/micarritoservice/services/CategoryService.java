package uy.edu.cei.micarritoservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import uy.edu.cei.micarritoservice.entities.Category;
import uy.edu.cei.micarritoservice.mapper.CategoryMapper;

@Service
public class CategoryService {
	
	private CategoryMapper categoryMapper;
	
	public CategoryService(CategoryMapper categoryMapper) {
		this.categoryMapper = categoryMapper;
	}

	public List<Category> fetchAll() {
		return this.categoryMapper.fetchAll();
	}
}
