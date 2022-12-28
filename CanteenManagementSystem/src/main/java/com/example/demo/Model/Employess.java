package com.example.demo.Model;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employess {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  empId;
	private String empName;
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeAccount empAccount;
	 @OneToOne
	 private Roles role;
	
	public Employess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employess(int empId, String empName, EmployeeAccount empAccount, Roles role) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAccount = empAccount;
		this.role = role;
	}


	public Roles getRole() {
		return role;
	}


	public void setRole(Roles role) {
		this.role = role;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public EmployeeAccount getEmpAccount() {
		return empAccount;
	}
	public void setEmpAccount(EmployeeAccount empAccount) {
		this.empAccount = empAccount;
	}


	
	

}
