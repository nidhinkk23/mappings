package com.tyss.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

import lombok.extern.java.Log;
@Log
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	//factory method provided by spring
    	Hello hello = context.getBean(Hello.class);
    	
    	log.info(hello.getMessage());
    	log.info(hello.getMap().toString());
    	log.info(hello.getList().toString());
    	
    	Hello hello2 = context.getBean(Hello.class);
    	log.info(hello2.getMessage());
    	log.info(Boolean.toString(hello==hello2));
    	//singleton same obj by default scope=singleton
    	
    	//To create diffrent obj give scope=prototype
    	
    	log.info("*************************************");
    	
    	//dependency injection
    	Animal animal = context.getBean(Animal.class);
    	
    	animal.makeSound();
    	
    	
    	Pet pet = context.getBean(Pet.class);
    	log.info(pet.getName());
    	pet.getAnimal().makeSound();
    	
    	context.close();// present -> ClassPathXmlApplicationContext
    	
    }
}
