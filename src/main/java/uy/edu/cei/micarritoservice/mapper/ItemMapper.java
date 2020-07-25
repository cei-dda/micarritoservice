package uy.edu.cei.micarritoservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import uy.edu.cei.micarritoservice.entities.Item;

@Repository
@Mapper
public interface ItemMapper {
	
	public Item fetchItemById(@Param("id") Long id);
	
}
