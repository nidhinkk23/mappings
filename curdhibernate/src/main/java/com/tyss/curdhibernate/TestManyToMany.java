package com.tyss.curdhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.curdhibernate.manytomany.ProjectInfo;
import com.tyss.curdhibernate.onetoone.EmployeePrimaryInfo;

public class TestManyToMany {
	public static void main(String[] args) {

		EmployeePrimaryInfo primaryInfo=new EmployeePrimaryInfo();


		primaryInfo.setEmpid(210);
		primaryInfo.setName("DQ");
		primaryInfo.setOfficial_email("ss@gmail.com");
		primaryInfo.setDate("2007-07-21");
		primaryInfo.setDesignation("SEngg");
		primaryInfo.setDOB("2005-04-04");
		primaryInfo.setExperiance(3);
		primaryInfo.setSalary(34252);
		EmployeePrimaryInfo primaryInfo1=new EmployeePrimaryInfo();


		primaryInfo1.setEmpid(211);
		primaryInfo1.setName("Tovi");
		primaryInfo1.setOfficial_email("ss@gmail.com");
		primaryInfo1.setDate("2007-07-21");
		primaryInfo1.setDesignation("SEngg");
		primaryInfo1.setDOB("2005-04-04");
		primaryInfo1.setExperiance(3);
		primaryInfo1.setSalary(34252);
		
		ArrayList<EmployeePrimaryInfo> arrayList = new ArrayList<EmployeePrimaryInfo>();
		arrayList.add(primaryInfo);
		arrayList.add(primaryInfo1);
		
		ProjectInfo project = new ProjectInfo();
		project.setPid(30);
		project.setProjectName("ems");;
		project.setStart_date("2004-12-27");
		project.setEnd_date("2012-12-21");
		project.setTechnology("java");
		project.setLocation("USA");
		project.setPrimaryInfo(arrayList);
		

		ProjectInfo project1 = new ProjectInfo();
		project1.setPid(31);
		project1.setProjectName("ecom");;
		project1.setStart_date("2004-12-27");
		project1.setEnd_date("2012-12-21");
		project1.setTechnology("java");
		project1.setLocation("USA");
		project1.setPrimaryInfo(arrayList);
		
		ArrayList<ProjectInfo> arrayList1 = new ArrayList<ProjectInfo>();
		arrayList1.add(project);
		arrayList1.add(project1);
		
		
		primaryInfo.setProjectInfo(arrayList1);
		primaryInfo1.setProjectInfo(arrayList1);
		
		EntityManagerFactory factory = null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		
		

		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(primaryInfo1);
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
