package com.tyss.springcore.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.beans.Cat;
import com.tyss.springcore.beans.Dog;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

@Configuration
public class BeansConfig {
	@Bean(name="hello")
	@Scope("prototype")
	//should be non-static
	public Hello getHello() {
		Hello hello =new Hello();
		hello.setMessage("I Love Spring");
		return hello;
	}
	
//	@Bean("beanFactoryPostProcessor")
//	public BeanFactoryPostProcessor  getBeanFactoryPostProcessor() {
//		return new BeanFactoryPostP;
//	}
//	
//	@Bean("beanPostProcessor")
//	public BeanPostProcessor getBeanPostProcessor() {
//		return new BeanPostProcessorImpl();
//	}
	
	
	
//	@Bean("dog")
//	public Dog getDog() {
//		return new Dog();
//	}
	@Bean
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	
	
/*	@Bean("pet")
	public Pet getPet() {
		
		Pet pet = new Pet();
		pet.setName("jinni");
//		pet.setAnimal(getDog());
		return pet;
	}*/
}
