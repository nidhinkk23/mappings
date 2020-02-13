package com.tyss.curdhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.curdhibernate.dto.Employee;

public class InsertDemo {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(102);
		employee.setName("sarath");
		employee.setSalary(2000);
		
		employee.setDept_id(1);
		employee.setDate("1997-11-24");
		employee.setPhone(124532141);
		employee.setOfficial_email("sarath@gmail.com");
		employee.setDesignation("sengg");
		employee.setDOB("1997-7-24");
		employee.setManager_id(1);
		employee.setExperiance(3);
		
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			System.out.println("inserted successfully");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
			manager.close();
			factory.close();
		}

	}//End of the Method

}
