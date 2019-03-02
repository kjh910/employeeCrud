package com.employee.form;

public class ManagerForm {
	private EmployeeForm employeeForm;
	private Long manGrade;
	
	public EmployeeForm getEmployeeForm() {
		return employeeForm;
	}
	public void setEmployeeForm(EmployeeForm employeeForm) {
		this.employeeForm = employeeForm;
	}
	public Long getManGrade() {
		return manGrade;
	}
	public void setManGrade(Long manGrade) {
		this.manGrade = manGrade;
	}
}
