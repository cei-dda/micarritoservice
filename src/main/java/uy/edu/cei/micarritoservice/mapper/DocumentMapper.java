package uy.edu.cei.micarritoservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import uy.edu.cei.micarritoservice.entities.Document;

@Repository
@Mapper
public interface DocumentMapper {

	public List<Document> fetchDocuments(
			@Param("document_id") Long document_id,
			@Param("user_id") Long user_id);
	
}
