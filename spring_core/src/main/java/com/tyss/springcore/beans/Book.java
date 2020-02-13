package com.tyss.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component

public class Book {
	public Book() {}
	public Book(String name, Author author) {
		super();
		this.name = name;
		this.author = author;
	}
	private String name;
	@Autowired
	private Author author;
	
}
