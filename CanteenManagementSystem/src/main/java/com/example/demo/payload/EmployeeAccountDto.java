package com.example.demo.payload;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.example.demo.Model.Employess;

public class EmployeeAccountDto {
	private int empId;
	
    private long accountBalance;
   
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
    
}
