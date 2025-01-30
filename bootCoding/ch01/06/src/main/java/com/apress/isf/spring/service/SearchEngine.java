package com.apress.isf.spring.service;

import java.util.List;

import com.apress.isf.spring.model.Document;
import com.apress.isf.spring.model.Type;

public interface SearchEngine {
	public List<Document> findByType(Type decumentType);
	public List<Document> listAll();
}
