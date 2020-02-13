package com.tyss.curdhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.curdhibernate.dto.Employee;


public class ReadDmo {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		
		factory = Persistence.createEntityManagerFactory("test");
		manager = factory.createEntityManager();
		String jpql = "select m.name from Employee m";
//		Query query = manager.createQuery(jpql);
		TypedQuery<String> query = manager.createQuery(jpql, String.class);
		List<String> record = query.getResultList();
		System.out.println("record"+record);
		for (String employee : record) {
			System.out.println("Name: "+employee);
		}
	}

}
