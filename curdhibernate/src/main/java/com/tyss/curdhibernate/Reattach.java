package com.tyss.curdhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.curdhibernate.dto.Employee;
import com.tyss.curdhibernate.onetoone.EmployeePrimaryInfo;

public class Reattach {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo record = manager.find(EmployeePrimaryInfo.class, 159);
			System.out.println(manager.contains(record));
			manager.detach(record);
			System.out.println(manager.contains(record));
			EmployeePrimaryInfo rs = manager.merge(record);
			rs.setName("Messi");
			System.out.println("updated");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
			manager.close();
			factory.close();
		}

		
		

	}
}
