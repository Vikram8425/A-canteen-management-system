package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ItemOfDay;

public interface ItemOfDayRepository extends JpaRepository<ItemOfDay,Integer> {

}
