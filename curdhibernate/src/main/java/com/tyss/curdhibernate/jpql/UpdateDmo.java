package com.tyss.curdhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.curdhibernate.dto.Employee;

public class UpdateDmo {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String jpql = "update Employee m set m.name='Dulqer' where m.id=101";
			Query query = manager.createQuery(jpql);
			int result = query.executeUpdate();
			System.out.println("updated"+result);
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
