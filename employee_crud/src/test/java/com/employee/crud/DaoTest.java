package com.employee.crud;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.employee.dao.DepartmentDao;
import com.employee.dao.EmployeeDao;
import com.employee.entity.DepartmentEntity;
import com.employee.entity.EmployeeEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DaoTest {

	@Inject
	DataSource dataSource;
	
	@Inject
	DepartmentDao departmentDao;
	
	@Inject
	EmployeeDao employeeDao;
	
	@Test
	public void selectDepAll() throws Exception {
		
		DepartmentEntity departmentEntity = new DepartmentEntity();
		departmentDao.select(departmentEntity);
	}
	
	@Test
	public void searchEmp() throws Exception {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeDao.searchEmpEmail(employeeEntity);
	}
	
	@Test
	public void searchEmpList() throws Exception {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeDao.searchEmloyee(employeeEntity);
	}
}
