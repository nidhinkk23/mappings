package com.tyss.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Author;
import com.tyss.springcore.beans.Book;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;
import com.tyss.springcore.config.SpringConfig;

public class AnnotationComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
	
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMessage());
		
		Book book = context.getBean(Book.class);
		book.setName("bookName");
		
		book.getAuthor().setName("authr Name");
		book.getAuthor().setPenName("penName");
		System.out.println(book.getName());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenName());
		
		
		
	
	
	}
}
