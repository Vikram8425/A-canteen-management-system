package com.example.demo.payload;
import com.example.demo.Model.MasterList;

public class ItemOfDayDto {
	private int id;
	private MasterListDto list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MasterListDto getList() {
		return list;
	}
	public void setList(MasterListDto list) {
		this.list = list;
	}
	
	
}
