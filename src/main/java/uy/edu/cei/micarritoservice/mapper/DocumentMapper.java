package uy.edu.cei.micarritoservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import uy.edu.cei.micarritoservice.entities.Document;

@Repository
@Mapper
public interface DocumentMapper {

	public Document fetchDocument(
			@Param("document_id") Long document_id,
			@Param("user_id") Long user_id);
	
}
