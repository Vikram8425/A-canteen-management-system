package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Roles;

public interface RoleRepository extends JpaRepository<Roles,Integer> {
 public Roles	findById(int roleId);
}
