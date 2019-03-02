package com.employee.entity;

import java.util.Date;

public class Del_EmployeeEntity {
	
	private EmployeeEntity employeeEntity;
	private Date delDate;
	
	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}
	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}
	public Date getDelDate() {
		return delDate;
	}
	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}
}
