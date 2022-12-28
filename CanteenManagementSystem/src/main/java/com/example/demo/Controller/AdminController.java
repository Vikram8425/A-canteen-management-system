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

import com.example.demo.ServiceImp.AdminService;
import com.example.demo.payload.AdminDto;
import com.example.demo.payload.EmployessDto;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@PostMapping("/")
	public ResponseEntity<?> createAccount(@RequestBody AdminDto info){
		AdminDto createAccount = this.adminService.createAccount(info);
		return new ResponseEntity<AdminDto>(createAccount,HttpStatus.ACCEPTED);
	}
	@PostMapping("/add")
	public ResponseEntity<?>addEmp(@RequestBody EmployessDto emp){
	 EmployessDto addEmployee = this.adminService.addEmployee(emp);
		return new  ResponseEntity<EmployessDto>(addEmployee,HttpStatus.OK);
	}
	@PostMapping("/addMoney/{empId}/{bal}")
	public ResponseEntity<?>addMonet(@PathVariable int empId,@PathVariable int bal ){
	    EmployessDto addMoney = this.adminService.addMoney(empId, bal);
		return new  ResponseEntity<EmployessDto>(addMoney,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<?>viewAll( ){
	    List<EmployessDto> viewAllEmp = this.adminService.viewAllEmp();
		return new  ResponseEntity<List<EmployessDto>>(viewAllEmp,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>viewById(@PathVariable int id){
	     EmployessDto viewById = this.adminService.ViewById(id);
		return new  ResponseEntity<EmployessDto>(viewById,HttpStatus.OK);
	}
	
	@GetMapping("check/{id}")
	public ResponseEntity<?>checkBal(@PathVariable int id){
	     EmployessDto checkBalance = this.adminService.checkBalance(id);
		return new  ResponseEntity<EmployessDto>(checkBalance,HttpStatus.OK);
	}
	
	
	
	
	

}
