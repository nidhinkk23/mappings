package com.tyss.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
public class Pet {
	
	
	public Pet() {}
	public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}
	
	
	
	private String name;
	@Autowired//default byType
//	@Qualifier("dog")//to make it byname
	private Animal animal;
	
	
}
