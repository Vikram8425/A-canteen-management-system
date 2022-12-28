package com.example.demo.Model;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String name;
   @OneToOne(cascade = CascadeType.ALL)
	private EmployeeAccount empAccount;

	@OneToOne
   private Roles role;
  




public Admin(int id, String name, EmployeeAccount empAccount, Roles role) {
		super();
		this.id = id;
		this.name = name;
		this.empAccount = empAccount;
		this.role = role;
	}
public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
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
public EmployeeAccount getEmpAccount() {
	return empAccount;
}
public void setEmpAccount(EmployeeAccount empAccount) {
	this.empAccount = empAccount;
}

   
}
