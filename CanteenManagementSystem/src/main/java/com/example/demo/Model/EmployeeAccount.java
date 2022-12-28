package com.example.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
   private double AccountBalance;
    public double getAccountBalance() {
	return AccountBalance;
}
public void setAccountBalance(double accountBalance) {
	AccountBalance = accountBalance;
}
	@OneToOne(mappedBy = "empAccount" ,cascade = CascadeType.ALL)
    private Employess emp;
	public EmployeeAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeAccount(int empId, long accountNumber, long accountBalance, Employess emp) {
		super();
		this.empId = empId;
		this.emp = emp;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public Employess getEmp() {
		return emp;
	}
	public void setEmp(Employess emp) {
		this.emp = emp;
	}
	
    
}
