package com.example.demo.payload;

public class MasterListDto {
	
	    private int id;
	    private String itemName;
	    private double itemPrice;
	    private int quantity;
	   private ItemsDto Item;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ItemsDto getItem() {
		return Item;
	}
	public void setItem(ItemsDto item) {
		Item = item;
	}
	   
}
