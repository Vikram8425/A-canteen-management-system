package com.example.demo.payload;

import javax.persistence.OneToOne;

import com.example.demo.Model.EmployeeAccount;
import com.example.demo.Model.Roles;

public class EmployessDto {
	
	private String empName;
	private EmployeeAccountDto empAccount;
	 private RoleDto role;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public EmployeeAccountDto getEmpAccount() {
		return empAccount;
	}
	public void setEmpAccount(EmployeeAccountDto empAccount) {
		this.empAccount = empAccount;
	}
	public RoleDto getRole() {
		return role;
	}
	public void setRole(RoleDto role) {
		this.role = role;
	}
	 
	 
	 
}
