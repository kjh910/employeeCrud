package com.employee.entity;

public class ManagerEntity {
	
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
