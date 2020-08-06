package uy.edu.cei.micarritoservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import uy.edu.cei.micarritoservice.entities.Category;

@Repository
@Mapper
public interface CategoryMapper {

	public List<Category> fetchAll();
	
}
