package com.tyss.curdhibernate.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tyss.curdhibernate.onetoone.EmployeePrimaryInfo;
import com.tyss.curdhibernate.onetoone.EmployeeSecondaryInfo;

import lombok.Data;
import lombok.ToString.Exclude;


@Data
@Entity
@Table(name="Project_Info")

public class ProjectInfo implements Serializable {
	
	
	@Id
	@Column
	private int pid;
	@Column
	private String projectName;
	@Column
	private String technology;
	@Column
	private String location;
	@Column
	private String start_date;
	@Column
	private String end_date;
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "project_employee",joinColumns = @JoinColumn(name="pid"),
	inverseJoinColumns = @JoinColumn(name="empid"))
	private List<EmployeePrimaryInfo> primaryInfo;
	
	
	
	
	
	
	
	
	
}
