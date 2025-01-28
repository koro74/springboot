package com.apress.isf.spring;

import com.apress.isf.spring.model.Document;
import com.apress.isf.spring.model.Type;
import com.apress.isf.spring.service.MySearchEngine;
import com.apress.isf.spring.service.SearchEngine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MyDocumentTest {
	
	private SearchEngine engine = new MySearchEngine();
	
	@Test
	public void testFindByType() {
		Type documentType = new Type();
		documentType.setName("WEB");
		documentType.setDesc("Web Link");
		documentType.setExtension(".url");
		
		List<Document> documents = engine.findByType(documentType);
		assertNotNull(documents);
		assertTrue(documents.size() == 1);
		assertEquals(documentType.getName(), documents.get(0).getType().getName());
		assertEquals(documentType.getDesc(), documents.get(0).getType().getDesc());
		assertEquals(documentType.getExtension(), documents.get(0).getType().getExtension());
	}
	
	@Test
	public void testListAll() {
		List<Document> documents = engine.listAll();
		assertNotNull(documents);
		assertTrue(documents.size() == 4);
	}
	
}
