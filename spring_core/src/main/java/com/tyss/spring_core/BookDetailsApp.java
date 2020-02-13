package com.tyss.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Book;

import lombok.extern.java.Log;
@Log
public class BookDetailsApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
    	Book book = context.getBean(Book.class);
    	log.info(book.getName());
    	log.info(book.getAuthor().getName());
    	log.info(book.getAuthor().getPenName());
	}
}
