package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.MasterList;

public interface MasterRepository extends JpaRepository<MasterList,Integer> {
public	MasterList	findById(int itemId);
}
