package com.apress.isf.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apress.isf.spring.model.Type;
import com.apress.isf.spring.service.MySearchEngine;

@Configuration
public class MyDocumentsContext {

    @Bean
    MySearchEngine mySearchEngine() {
		
		MySearchEngine engine = new MySearchEngine();
		
		return engine;
	}
	
	@Bean
	Type type() {
		Type documentType = new Type();
		
		documentType.setName("WEB");
		documentType.setDesc("Web Link");
		documentType.setExtension(".url");
		
		return documentType;
	}	
	
}
