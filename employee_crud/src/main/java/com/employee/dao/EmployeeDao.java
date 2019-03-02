package com.employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeEntity;
import com.employee.form.EmployeeForm;

@Repository
public interface EmployeeDao {
	
	public List<String> searchEmpEmail(EmployeeEntity employeeEntity);
	
	public EmployeeForm searchEmloyee(EmployeeEntity employeeEntity);
	
}
