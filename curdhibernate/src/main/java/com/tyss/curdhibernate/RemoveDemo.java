package com.tyss.curdhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.curdhibernate.dto.Employee;


public class RemoveDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Employee record = manager.find(Employee.class, 103);
			manager.remove(record);
			System.out.println("record deleted");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
			manager.close();
			factory.close();
		}

		
		
		
	}//End of the method 

}
