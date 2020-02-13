package com.tyss.curdhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.curdhibernate.dto.Employee;


public class FindDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager=null;

		factory = Persistence.createEntityManagerFactory("test");
		manager = factory.createEntityManager();
		Employee result = manager.find(Employee.class, 109);
		System.out.println(result.getId());
		System.out.println(result.getName());
		System.out.println(result.getDesignation());
		System.out.println(result.getDate());
		System.out.println(result.getExperiance());
		System.out.println(result.getDOB());		

		manager.close();
		factory.close();



	}//End of the method 

}
