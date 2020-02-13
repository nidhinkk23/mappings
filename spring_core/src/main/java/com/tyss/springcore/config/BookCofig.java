package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.beans.Author;
import com.tyss.springcore.beans.Book;

@Configuration
public class BookCofig {
	@Bean
	public Author getAuthor() {
		Author author = new Author();
//		Author author = new Author("basheer", "kk"); 
		author.setName("basheeeer");
		author.setPenName("ss");
		return author;
		
	}
	
	
	@Bean
	public Book getBook() {
		Book book = new Book();
//		book.setAuthor(getAuthor());
		book.setName("AaduJeevitham");
//		Book book =new Book("hhhbook",getAuthor());
		return book;
	}
}
