package com.example.demo.payload;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.demo.Model.EmployeeAccount;
import com.example.demo.Model.Roles;

public class AdminDto {
	
   private int id;
   private String name;
   private EmployeeAccountDto empAccount;
   private RoleDto role;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
