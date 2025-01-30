package com.apress.isf.spring;

import com.apress.isf.spring.config.MyDocumentsContext;
import com.apress.isf.spring.model.Document;
import com.apress.isf.spring.model.Type;
import com.apress.isf.spring.service.SearchEngine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyDocumentsWithSpringTest {
	
	private AnnotationConfigApplicationContext context;
	private SearchEngine engine;
	private Type documentType;
	
	@BeforeEach
	public void setup() {
		context = new AnnotationConfigApplicationContext(MyDocumentsContext.class);
		engine = context.getBean(SearchEngine.class);
		documentType = context.getBean(Type.class);
	}
	
    @Test
    public void testWithSpringFindByType() {	
        List<Document> documents = engine.findByType(documentType);
        assertNotNull(documents);
        assertTrue(documents.size() == 1);
        assertEquals(documentType.getName(), documents.get(0).getType().getName());
        assertEquals(documentType.getDesc(), documents.get(0).getType().getDesc());
        assertEquals(documentType.getExtension(),
            documents.get(0).getType().getExtension());
    }

    @Test
    public void testWithSpringListAll() {		
        List<Document> documents = engine.listAll();
        assertNotNull(documents);
        assertTrue(documents.size() == 4);
    }
	
}
