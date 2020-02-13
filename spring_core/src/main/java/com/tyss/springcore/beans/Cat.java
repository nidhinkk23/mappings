package com.tyss.springcore.beans;

public class Cat implements Animal {

	@Override
	public void makeSound() {
		
		System.out.println("meow");		
	}

}
