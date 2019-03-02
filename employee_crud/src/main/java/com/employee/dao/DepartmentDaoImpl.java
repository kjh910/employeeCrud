package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.employee.entity.DepartmentEntity;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{

	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	@Inject
	DataSource dataSource;
	
	@Override
	public void select(DepartmentEntity departmentEntity) {
		// TODO Auto-generated method stub
		
			try (Connection connection = dataSource.getConnection()) {
				System.out.println("success");

				String searchAll = "select * from DEPARTMENT";

				preparedStatement = connection.prepareStatement(searchAll);
				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					departmentEntity.setDepId(resultSet.getLong(1));
					departmentEntity.setDepName(resultSet.getString(2));
					departmentEntity.setDepEmptotal(resultSet.getLong(3));

					System.out.println("Id : " + departmentEntity.getDepId() + "Name : " + departmentEntity.getDepName()
							+ "Total : " + departmentEntity.getDepEmptotal());
				}

				resultSet.close();
				preparedStatement.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
