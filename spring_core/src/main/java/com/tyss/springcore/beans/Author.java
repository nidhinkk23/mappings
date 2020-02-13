package com.tyss.springcore.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Author {
	public Author() {
		
	}
	public Author(String name, String penName) {
		super();
		this.name = name;
		this.penName = penName;
	}
	private String name;
	private String penName;
	
}
