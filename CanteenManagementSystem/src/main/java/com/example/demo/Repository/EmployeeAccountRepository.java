package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.EmployeeAccount;

public interface EmployeeAccountRepository  extends JpaRepository<EmployeeAccount, Integer>{

}
