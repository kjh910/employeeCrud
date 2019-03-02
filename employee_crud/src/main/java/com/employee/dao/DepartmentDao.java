package com.employee.dao;

import org.springframework.stereotype.Repository;

import com.employee.entity.DepartmentEntity;

@Repository
public interface DepartmentDao {
	
	public void select(DepartmentEntity departmentEntity) throws Exception;

}
