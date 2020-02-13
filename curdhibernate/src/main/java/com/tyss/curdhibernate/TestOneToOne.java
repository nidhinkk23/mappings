package com.tyss.curdhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.curdhibernate.dto.Employee;
import com.tyss.curdhibernate.onetoone.EmployeePrimaryInfo;
import com.tyss.curdhibernate.onetoone.EmployeeSecondaryInfo;

public class TestOneToOne {
	public static void main(String[] args) {
		
		EmployeePrimaryInfo primaryInfo=new EmployeePrimaryInfo();
		
		
		primaryInfo.setEmpid(111);
		primaryInfo.setName("Ronado");
		primaryInfo.setOfficial_email("ss@gmail.com");
		
		EmployeeSecondaryInfo employeeSecondaryInfo = new EmployeeSecondaryInfo();
		
		employeeSecondaryInfo.setPrimary(primaryInfo);
		employeeSecondaryInfo.setBlood_group("B+ve");
		
		
		
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
//			manager.persist(employeeSecondaryInfo);
			EmployeePrimaryInfo pinfo = manager.find(EmployeePrimaryInfo.class,111);
			System.out.println(pinfo.getSecondaryInfo().getBlood_group());
			
			transaction.commit();
			System.out.println("inserted successfully");
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
			manager.close();
			factory.close();
		}

	}
}
