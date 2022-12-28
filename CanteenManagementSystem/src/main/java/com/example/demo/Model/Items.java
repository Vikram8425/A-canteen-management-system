package com.example.demo.Model;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemsId;  
	@OneToMany(mappedBy = "Item",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<MasterList> list=new HashSet<>();
	@OneToOne
	private ItemOfDay itemofday;
	public Items(int itemsId, Set<MasterList> list, ItemOfDay itemofday) {
		super();
		this.itemsId = itemsId;
		this.list = list;
		this.itemofday = itemofday;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItemsId() {
		return itemsId;
	}
	public void setItemsId(int itemsId) {
		this.itemsId = itemsId;
	}
	public Set<MasterList> getList() {
		return list;
	}
	public void setList(Set<MasterList> list) {
		this.list = list;
	}
	public ItemOfDay getItemofday() {
		return itemofday;
	}
	public void setItemofday(ItemOfDay itemofday) {
		this.itemofday = itemofday;
	}
	
	
	
	 
}
