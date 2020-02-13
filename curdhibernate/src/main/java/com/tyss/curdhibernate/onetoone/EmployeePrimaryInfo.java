package com.tyss.curdhibernate.onetoone;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ListIndexBase;

import com.tyss.curdhibernate.manytomany.ProjectInfo;
import com.tyss.curdhibernate.manytoone.EmployeeAdressInfo;

import lombok.Data;
@Data
@Entity
@Table(name="Employee_Primary_Inf")
public class EmployeePrimaryInfo implements Serializable {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int empid;
	@Column
	private String name;
	@Column
	private double salary;
	@Column
	private int dept_id;
	@Column
	private String date;
	@Column
	private long phone;
	@Column
	private String official_email;
	@Column
	private String designation;
	@Column
	private String DOB;
	@Column
	private int manager_id;
	@Column
	private int experiance;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "primary")
	private EmployeeSecondaryInfo secondaryInfo;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "primary")
	private List<EmployeeAdressInfo> adressInfo;
	
	
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "primaryInfo")
	private List<ProjectInfo> projectInfo;
//	public int getEmpid() {
//		return empid;
//	}
//	public void setEmpid(int empid) {
//		this.empid = empid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	public int getDept_id() {
//		return dept_id;
//	}
//	public void setDept_id(int dept_id) {
//		this.dept_id = dept_id;
//	}
//	public String getDate() {
//		return date;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//	public long getPhone() {
//		return phone;
//	}
//	public void setPhone(long phone) {
//		this.phone = phone;
//	}
//	public String getOfficial_email() {
//		return official_email;
//	}
//	public void setOfficial_email(String official_email) {
//		this.official_email = official_email;
//	}
//	public String getDesignation() {
//		return designation;
//	}
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//	public String getDOB() {
//		return DOB;
//	}
//	public void setDOB(String dOB) {
//		DOB = dOB;
//	}
//	public int getManager_id() {
//		return manager_id;
//	}
//	public void setManager_id(int manager_id) {
//		this.manager_id = manager_id;
//	}
//	public int getExperiance() {
//		return experiance;
//	}
//	public void setExperiance(int experiance) {
//		this.experiance = experiance;
//	}
	
}
