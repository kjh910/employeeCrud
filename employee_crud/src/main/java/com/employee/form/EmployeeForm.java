package com.employee.form;

import java.util.Date;

public class EmployeeForm {
	private Long empNum;
	private String empPw;
	private String empName;
	private String empGender;
	private Date empBirthday;
	private Long depId;
	private String empPosition;
	private Long empPhonenum;
	private String empEmail;
	private String empAddress;
	
	public Long getEmpNum() {
		return empNum;
	}
	public void setEmpNum(Long empNum) {
		this.empNum = empNum;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public Date getEmpBirthday() {
		return empBirthday;
	}
	public void setEmpBirthday(Date empBirthday) {
		this.empBirthday = empBirthday;
	}
	
	public Long getDepId() {
		return depId;
	}
	public void setDepId(Long depId) {
		this.depId = depId;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public Long getEmpPhonenum() {
		return empPhonenum;
	}
	public void setEmpPhonenum(Long empPhonenum) {
		this.empPhonenum = empPhonenum;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
}
