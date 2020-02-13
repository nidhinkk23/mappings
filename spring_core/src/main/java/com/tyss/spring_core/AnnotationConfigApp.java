package com.tyss.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;
import com.tyss.springcore.config.BeansConfig;

import lombok.extern.java.Log;
@Log
public class AnnotationConfigApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		
		Hello hello = context.getBean(Hello.class);
		log.info(hello.getMessage());
		
		Hello hello1 =context.getBean(Hello.class);
		log.info(hello1.getMessage());
		
		log.info(Boolean.toString(hello==hello1));
		
		log.info("-----------------------");
		
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		Pet pet = context.getBean(Pet.class);
		log.info(pet.getName());
		pet.getAnimal().makeSound();
		
		
	}
}
