package com.tyss.curdhibernate.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Embeddable
public class EmployeeAddressPK implements Serializable {
	
	private int empid;
	private String address_type;
	
	
	
}
