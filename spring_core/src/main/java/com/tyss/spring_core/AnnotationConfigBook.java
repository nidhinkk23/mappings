package com.tyss.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.Book;
import com.tyss.springcore.config.BeansConfig;
import com.tyss.springcore.config.BookCofig;

import lombok.extern.java.Log; 
@Log
public class AnnotationConfigBook {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BookCofig.class);
		
		Book book = context.getBean(Book.class);
		log.info("Book Name "+book.getName());
		log.info("Author FName  "+book.getAuthor().getName());
		log.info("Author PName "+book.getAuthor().getPenName());
		
		
	}
}
