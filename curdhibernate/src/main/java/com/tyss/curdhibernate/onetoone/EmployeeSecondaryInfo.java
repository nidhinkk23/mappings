package com.tyss.curdhibernate.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tyss.curdhibernate.dto.Employee;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="Employee_Secondary_Inf")
public class EmployeeSecondaryInfo implements Serializable {
	
	@Id
	
	private int empid;
	@Column
	private String gender;
	@Column
	private String personal_email;
	@Column
	private String job_location;
	@Column
	private boolean is_married;
	@Column
	private String emergency_con_no;
	@Column
	private String nationality;
	@Column
	private String gardian_name;
	@Column
	private long gardian_no;
	@Column
	private String govt_id;
	@Column
	private String blood_group;
	@Column
	private boolean is_physically_challenged;
	@Column
	private String known_lang;
	@Exclude
	@MapsId
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empid")
	private EmployeePrimaryInfo primary;

//	public int getEmpid() {
//		return empid;
//	}
//
//	public void setEmpid(int empid) {
//		this.empid = empid;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getPersonal_email() {
//		return personal_email;
//	}
//
//	public void setPersonal_email(String personal_email) {
//		this.personal_email = personal_email;
//	}
//
//	public String getJob_location() {
//		return job_location;
//	}
//
//	public void setJob_location(String job_location) {
//		this.job_location = job_location;
//	}
//
//	public boolean isIs_married() {
//		return is_married;
//	}
//
//	public void setIs_married(boolean is_married) {
//		this.is_married = is_married;
//	}
//
//	public String getEmergency_con_no() {
//		return emergency_con_no;
//	}
//
//	public void setEmergency_con_no(String emergency_con_no) {
//		this.emergency_con_no = emergency_con_no;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
//
//	public String getGardian_name() {
//		return gardian_name;
//	}
//
//	public void setGardian_name(String gardian_name) {
//		this.gardian_name = gardian_name;
//	}
//
//	public long getGardian_no() {
//		return gardian_no;
//	}
//
//	public void setGardian_no(long gardian_no) {
//		this.gardian_no = gardian_no;
//	}
//
//	public String getGovt_id() {
//		return govt_id;
//	}
//
//	public void setGovt_id(String govt_id) {
//		this.govt_id = govt_id;
//	}
//
//	public String getBlood_group() {
//		return blood_group;
//	}
//
//	public void setBlood_group(String blood_group) {
//		this.blood_group = blood_group;
//	}
//
//	public boolean isIs_physically_challenged() {
//		return is_physically_challenged;
//	}
//
//	public void setIs_physically_challenged(boolean is_physically_challenged) {
//		this.is_physically_challenged = is_physically_challenged;
//	}
//
//	public String getKnown_lang() {
//		return known_lang;
//	}
//
//	public void setKnown_lang(String known_lang) {
//		this.known_lang = known_lang;
//	}
//
//	public EmployeePrimaryInfo getPrimary() {
//		return primary;
//	}
//
//	public void setPrimary(EmployeePrimaryInfo primary) {
//		this.primary = primary;
//	}
//	
//	
	}
