package com.example.demo.ServiceImp;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Admin;
import com.example.demo.Model.EmployeeAccount;
import com.example.demo.Model.Employess;
import com.example.demo.Model.Roles;
import com.example.demo.Repository.AdminRepository;
import com.example.demo.Repository.EmployeeAccountRepository;
import com.example.demo.Repository.EmployessRepository;
import com.example.demo.Repository.RoleRepository;
import com.example.demo.payload.AdminDto;
import com.example.demo.payload.EmpResponse;
import com.example.demo.payload.EmployessDto;

@Service
public class AdminService {
	@Autowired
	private RoleRepository roleRepo;
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private AdminRepository adminRepo;
	@Autowired
	private EmployessRepository empRepo;
	@Autowired
	private EmployeeAccountRepository empAcoountRepo;
	
	public AdminDto createAccount(AdminDto info) {
		   Admin admin = this.mapper.map(info,Admin.class);
		   Roles roles = this.roleRepo.findById(1);
		   admin.setRole(roles);
		   EmployeeAccount account=new EmployeeAccount();
		   account.setAccountBalance(0);
		   admin.setEmpAccount(account);
		   System.out.println(info.getName());
		   Admin save = this.adminRepo.save(admin);
		return this.mapper.map(save,AdminDto.class);
	}
	
	public EmployessDto addEmployee(EmployessDto emp){
		Employess emp1 = this.mapper.map(emp,Employess.class);
		 EmployeeAccount account=new EmployeeAccount();
		 Roles roles = this.roleRepo.findById(2);
		 emp1.setRole(roles);
		   account.setAccountBalance(0);
		   emp1.setEmpAccount(account);
		   System.out.println(emp.getEmpName());
		Employess save = this.empRepo.save(emp1);
		return this.mapper.map(save,EmployessDto.class);
	}
	
	public List<EmployessDto> viewAllEmp(){
		 List<Employess> findAll=this.empRepo.findAll();
		 List<EmployessDto> collect = findAll.stream().map((each)->this.mapper.map(each,EmployessDto.class)).collect(Collectors.toList());
		return collect;
	}
	
    public EmployessDto addMoney(int empId ,int bal) {
    	Employess emp= this.empRepo.findById(empId);
    	 EmployeeAccount empAccount = emp.getEmpAccount(); 
    	 double accountBalance = empAccount.getAccountBalance();
    	double total=accountBalance+bal;
    	empAccount.setAccountBalance(total);
    	 this.empRepo.save(emp);
    	return this.mapper.map(empAccount,EmployessDto.class);
    }
    
    
    public EmployessDto ViewById(int empId) {
    	Employess emp= this.empRepo.findById(empId);
    	return this.mapper.map(emp,EmployessDto.class);
    }
    
    
    public EmployessDto checkBalance(int empId) {
    	Employess emp= this.empRepo.findById(empId);
    	EmployeeAccount empAccount = emp.getEmpAccount();
    	return this.mapper.map(empAccount,EmployessDto.class);
    }
    

}
