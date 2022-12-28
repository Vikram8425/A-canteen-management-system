package com.example.demo.ServiceImp;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.EmployeeAccount;
import com.example.demo.Model.Employess;
import com.example.demo.Model.ItemOfDay;
import com.example.demo.Model.Roles;
import com.example.demo.Repository.EmployessRepository;
import com.example.demo.Repository.ItemOfDayRepository;
import com.example.demo.Repository.RoleRepository;
import com.example.demo.payload.EmployeeAccountDto;
import com.example.demo.payload.EmployessDto;
import com.example.demo.payload.ItemOfDayDto;
@Service
public class EmployeeService {
	
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private EmployessRepository empRepo;
	@Autowired
	private ItemOfDayRepository itemofdayRepo;
	@Autowired
	private RoleRepository roleRepo;
	public EmployessDto createAccount(EmployessDto Dto){
		Employess emp = this.mapper.map(Dto,Employess.class);
		Roles role = this.roleRepo.findById(2);
		 EmployeeAccount account=new EmployeeAccount();
		   account.setAccountBalance(0);
		   emp.setEmpAccount(account);
		   emp.setRole(role);
		Employess save = this.empRepo.save(emp);
		return this.mapper.map(save,EmployessDto.class);
	}
	
	public EmployessDto checkBal(int empid){
		Employess emp = this.empRepo.findById(empid);
	  EmployeeAccount empAccount = emp.getEmpAccount();
     return this.mapper.map(empAccount,EmployessDto.class);
	}
	public List<ItemOfDayDto> viewItemOfDay(){
		List<ItemOfDay> findAll = this.itemofdayRepo.findAll();
		List<ItemOfDayDto> collect = findAll.stream().map((each)->this.mapper.map(each,ItemOfDayDto.class)).collect(Collectors.toList());
		return collect;
	}
	
	public EmployessDto addMoney(int empId,int bal){
		Employess emp= this.empRepo.findById(empId);
   	 EmployeeAccount empAccount = emp.getEmpAccount(); 
   	 double accountBalance = empAccount.getAccountBalance();
   	double total=accountBalance+bal;
   	empAccount.setAccountBalance(total);
   	 this.empRepo.save(emp);
		return this.mapper.map(empAccount,EmployessDto.class);
	}
	
	

}
