package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MasterList {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String itemName;
	    private double itemPrice;
	    private int quantity;
	    @ManyToOne
	   private Items Item;
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
		public Items getItem() {
			return Item;
		}
		public void setItem(Items item) {
			Item = item;
		}
		public MasterList(int id, String itemName, double itemPrice, int quantity, Items item) {
			super();
			this.id = id;
			this.itemName = itemName;
			this.itemPrice = itemPrice;
			this.quantity = quantity;
			Item = item;
		}
		public MasterList() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    


}
