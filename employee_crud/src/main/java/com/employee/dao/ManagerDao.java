package com.employee.dao;

import com.employee.entity.EmployeeEntity;

public class ManagerDao {
	
	private EmployeeEntity employeeEntity;
	private Long manGrade;
	
	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}
	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}
	public Long getManGrade() {
		return manGrade;
	}
	public void setManGrade(Long manGrade) {
		this.manGrade = manGrade;
	}
}
