package com.tyss.curdhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.curdhibernate.manytoone.EmployeeAddressPK;
import com.tyss.curdhibernate.manytoone.EmployeeAdressInfo;
import com.tyss.curdhibernate.onetoone.EmployeePrimaryInfo;
import com.tyss.curdhibernate.onetoone.EmployeeSecondaryInfo;

public class TestManyToOne {
public static void main(String[] args) {
		
		EmployeePrimaryInfo primaryInfo=new EmployeePrimaryInfo();
		
		
		primaryInfo.setEmpid(156);
		primaryInfo.setName("Ronado");
		primaryInfo.setOfficial_email("ss@gmail.com");
		primaryInfo.setDate("2007-07-21");
		primaryInfo.setDesignation("SEngg");
		primaryInfo.setDOB("2005-04-04");
		primaryInfo.setExperiance(3);
		
		
		
		EmployeeAddressPK addressPK  = new EmployeeAddressPK();
		addressPK.setEmpid(102);
		addressPK.setAddress_type("permanent");
		
		
		EmployeeAdressInfo address = new EmployeeAdressInfo();
		address.setAddressPK(addressPK);
		address.setAddress1("bang");
		address.setAddress2("kar");
		address.setCity("city");
		address.setHouse_no(3);
		address.setLand_mark("landdd");
		address.setPin_code(231);
		address.setPrimary(primaryInfo);
		
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo info =manager.find(EmployeePrimaryInfo.class, 156);
//			address.setPrimary(info);
//			manager.persist(address);
			System.out.println(info.getAdressInfo().get(1).getAddressPK().getAddress_type());
			System.out.println("inserted successfully");
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
