package com.tyss.curdhibernate.manytoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tyss.curdhibernate.onetoone.EmployeePrimaryInfo;
import com.tyss.curdhibernate.onetoone.EmployeeSecondaryInfo;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="Employee_Address_info")
public class EmployeeAdressInfo implements Serializable {
	@EmbeddedId
	private EmployeeAddressPK addressPK;
	@Column
	private int house_no;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String land_mark;
	@Column
	private String city;
	@Column
	private int pin_code;
	
	@Exclude
	@MapsId("empid")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empid")
	private EmployeePrimaryInfo primary;
	
}
