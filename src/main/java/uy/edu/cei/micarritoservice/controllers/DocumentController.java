package uy.edu.cei.micarritoservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.cei.micarritoservice.entities.Document;
import uy.edu.cei.micarritoservice.mapper.DocumentMapper;

@RestController
public class DocumentController {

	@Autowired
	private DocumentMapper documentMapper;
	
	// /document?user=1&document=1
	@GetMapping("/document")
	public List<Document> show(
			@RequestParam(value = "document", required = false) Long documentId,
			@RequestParam(value = "user", required = true) Long userId) {
		return this.documentMapper.fetchDocuments(documentId, userId);
	}
}
