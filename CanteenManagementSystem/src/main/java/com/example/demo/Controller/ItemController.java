package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.ItemService;
import com.example.demo.payload.*;
@RestController
@RequestMapping("/item")
public class ItemController{
	@Autowired
	private ItemService itemService;
	
		@PostMapping("/add")
	public	ResponseEntity<?>addNewItem(@RequestBody MasterListDto info){
			MasterListDto addnewItem = this.itemService.addnewItem(info);
			return new ResponseEntity<MasterListDto>(addnewItem,HttpStatus.ACCEPTED);
		}
		@GetMapping("/")
	public	ResponseEntity<?>viewAllItem(){
			List<MasterListDto> viewAllItem = this.itemService.viewAllItem();
			return new ResponseEntity<List<MasterListDto>>(viewAllItem,HttpStatus.ACCEPTED);
		}
		@PostMapping("/{itemId}")
	public	ResponseEntity<?>addItemOfDay(@PathVariable int itemId){
			ItemOfDayDto addItemOfDay = this.itemService.addItemOfDay(itemId);
			return new ResponseEntity<ItemOfDayDto>(addItemOfDay,HttpStatus.ACCEPTED);
		}
		
	@DeleteMapping("/")
	public ResponseEntity<?> ResetItemofDay() {
		this.itemService.removeItemOfDay();
		return new ResponseEntity<Respnse>(new Respnse("Reset item of day",true),HttpStatus.OK);
	}
		
		
		
}
