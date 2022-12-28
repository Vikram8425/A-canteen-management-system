package com.example.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class ItemOfDay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private MasterList list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MasterList getList() {
		return list;
	}
	public void setList(MasterList list) {
		this.list = list;
	}
	public ItemOfDay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemOfDay(int id, MasterList list) {
		super();
		this.id = id;
		this.list = list;
	}
	
}
