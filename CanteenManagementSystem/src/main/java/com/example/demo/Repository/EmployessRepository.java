package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Employess;

public interface EmployessRepository extends JpaRepository<Employess,Integer> {
  public Employess findById(int empid);
}
