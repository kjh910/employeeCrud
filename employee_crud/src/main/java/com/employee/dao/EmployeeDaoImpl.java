package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.employee.entity.DepartmentEntity;
import com.employee.entity.EmployeeEntity;
import com.employee.form.EmployeeForm;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	@Inject
	DataSource dataSource;

	@Override
	public List<String> searchEmpEmail(EmployeeEntity employeeEntity) {
		
		List<String> loginList = new ArrayList<String>();
		try (Connection connection = dataSource.getConnection()) {
			System.out.println("success");

			String searchEmpEmailAndPw = "select emp_email, emp_pw from EMPLOYEE where emp_email = ? and emp_pw = ?";

			preparedStatement = connection.prepareStatement(searchEmpEmailAndPw);
			
			preparedStatement.setString(1, employeeEntity.getEmpEmail());
			preparedStatement.setString(2, employeeEntity.getEmpPw());
			
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				loginList.add(resultSet.getString(1));
				loginList.add(resultSet.getString(2));
				
				//employeeEntity.setEmpEmail(resultSet.getString(1));
				//employeeEntity.setEmpPw(resultSet.getString(2));
				
				System.out.println(employeeEntity.getEmpEmail() + employeeEntity.getEmpPw());
			}

			resultSet.close();
			preparedStatement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginList;
	}

	@Override
	public EmployeeForm searchEmloyee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		EmployeeForm employeeForm = new EmployeeForm();
		try (Connection connection = dataSource.getConnection()) {
			System.out.println("success");
			
			DepartmentEntity departmentEntity = new DepartmentEntity();

			String searchAll = "select * from EMPLOYEE where emp_num = ? ";

			preparedStatement = connection.prepareStatement(searchAll);
			
			preparedStatement.setInt(1, 1);			
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				employeeEntity.setEmpNum(resultSet.getLong(1));
				employeeEntity.setEmpPw(resultSet.getString(2));
				employeeEntity.setEmpName(resultSet.getString(3));
				employeeEntity.setEmpGender(resultSet.getString(4));
				employeeEntity.setEmpBirthday(resultSet.getDate(5));
				departmentEntity.setDepId(resultSet.getLong(6));
				employeeEntity.setDepartmentEntity(departmentEntity);
				employeeEntity.setEmpPosition(resultSet.getString(7));
				employeeEntity.setEmpPhonenum(resultSet.getLong(8));
				employeeEntity.setEmpEmail(resultSet.getString(9));
				employeeEntity.setEmpAddress(resultSet.getString(10));
				
				employeeForm.setEmpNum(employeeEntity.getEmpNum());
				employeeForm.setEmpPw(employeeEntity.getEmpPw());
				employeeForm.setEmpName(employeeEntity.getEmpName());
				employeeForm.setEmpGender(employeeEntity.getEmpGender());
				employeeForm.setEmpBirthday(employeeEntity.getEmpBirthday());
				employeeForm.setDepId(employeeEntity.getDepartmentEntity().getDepId());
				employeeForm.setEmpPosition(employeeEntity.getEmpPosition());
				employeeForm.setEmpPhonenum(employeeEntity.getEmpPhonenum());
				employeeForm.setEmpEmail(employeeEntity.getEmpEmail());
				employeeForm.setEmpAddress(employeeEntity.getEmpAddress());
				
			}
			
			System.out.println(employeeForm.getEmpPw());

			resultSet.close();
			preparedStatement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeForm;
	}	
}
