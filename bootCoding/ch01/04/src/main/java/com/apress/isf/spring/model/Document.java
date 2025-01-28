package com.apress.isf.spring.model;

import lombok.Data;

@Data
public class Document {
	private String name;
	private Type type;
	private String location;
}
