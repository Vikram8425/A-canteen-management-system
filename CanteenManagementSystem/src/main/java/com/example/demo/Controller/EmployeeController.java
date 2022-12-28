package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.EmployeeService;
import com.example.demo.payload.EmployeeAccountDto;
import com.example.demo.payload.EmployessDto;
import com.example.demo.payload.ItemOfDayDto;

@RestController
@RequestMapping("/emp")
public class EmployeeController{
	@Autowired
	private EmployeeService empService;
   @PostMapping("/")
	public ResponseEntity<?>createAccount(@RequestBody EmployessDto dto){
		EmployessDto createAccount = this.empService.createAccount(dto);
		return new ResponseEntity<EmployessDto>(createAccount,HttpStatus.OK);
	}
    @GetMapping("/{empid}")
     public ResponseEntity<?>checkBal(@PathVariable int empid){
    	EmployessDto checkBal = this.empService.checkBal(empid);
    	 return new  ResponseEntity<EmployessDto>(checkBal,HttpStatus.ACCEPTED);
     }
    
    @GetMapping("/viewDay")
    public ResponseEntity<?>viewItemOfDay(){
    	List<ItemOfDayDto> viewItemOfDay = this.empService.viewItemOfDay();
    	return new ResponseEntity<List<ItemOfDayDto>>(viewItemOfDay,HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/{empId}/{bal}")
  public ResponseEntity<?>addMoney(@PathVariable int empId,@PathVariable int bal){
	  EmployessDto addMoney = this.empService.addMoney(empId, bal);
    	return new ResponseEntity<EmployessDto>(addMoney,HttpStatus.OK);
    }
    
}
