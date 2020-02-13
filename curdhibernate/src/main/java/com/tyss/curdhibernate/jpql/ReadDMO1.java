package com.tyss.curdhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.tyss.curdhibernate.dto.Employee;

public class ReadDMO1 {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		
		factory = Persistence.createEntityManagerFactory("test");
		manager = factory.createEntityManager();
		String jpql = "select m from Employee m where m.id=101";
//		Query query = manager.createQuery(jpql);
		TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
		Employee employee = query.getSingleResult();
		
			System.out.println("Name: "+employee.getName());
			System.out.println(employee.getDesignation());
	
	}
}
