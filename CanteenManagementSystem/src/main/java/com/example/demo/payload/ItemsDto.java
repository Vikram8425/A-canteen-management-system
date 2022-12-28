package com.example.demo.payload;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.Model.ItemOfDay;
import com.example.demo.Model.MasterList;

public class ItemsDto{
	    private int itemsId;  
		private ItemOfDay itemofday;
		public int getItemsId() {
			return itemsId;
		}
		public void setItemsId(int itemsId) {
			this.itemsId = itemsId;
		}
		public ItemOfDay getItemofday() {
			return itemofday;
		}
		public void setItemofday(ItemOfDay itemofday) {
			this.itemofday = itemofday;
		}
		
		
}
