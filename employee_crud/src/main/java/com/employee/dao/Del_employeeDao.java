package com.employee.dao;

import java.util.Date;

import com.employee.entity.EmployeeEntity;

public class Del_employeeDao {
	
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
