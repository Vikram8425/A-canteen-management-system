package com.example.demo.ServiceImp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ItemOfDay;
import com.example.demo.Model.MasterList;
import com.example.demo.Repository.AdminRepository;
import com.example.demo.Repository.ItemOfDayRepository;
import com.example.demo.Repository.MasterRepository;
import com.example.demo.payload.ItemOfDayDto;
import com.example.demo.payload.ItemsDto;
import com.example.demo.payload.MasterListDto;

@Service
public class ItemService {
	
	@Autowired
	private AdminRepository adminRepo;
	@Autowired
	private MasterRepository masterRepo;
	@Autowired
	private ItemOfDayRepository itemofdayRepo;
	@Autowired
	private ModelMapper mapper;
	
	public MasterListDto addnewItem(MasterListDto info) {
		MasterList map = this.mapper.map(info,MasterList.class);
		MasterList save = this.masterRepo.save(map);
		return this.mapper.map(save,MasterListDto.class);
	}
	
	public List<MasterListDto>viewAllItem(){
		List<MasterList> findAll = this.masterRepo.findAll();
		List<MasterListDto> collect = findAll.stream().map((each)->this.mapper.map(each,MasterListDto.class)).collect(Collectors.toList());
		return collect;
	}
	
	public ItemOfDayDto addItemOfDay(int itemId) {
		MasterList item = this.masterRepo.findById(itemId);
		ItemOfDay itemofday=new ItemOfDay();
		itemofday.setList(item);
		ItemOfDay save2 = this.itemofdayRepo.save(itemofday);
	  return this.mapper.map(save2,ItemOfDayDto.class);
	}
	
	public void removeItemOfDay(){
		this.itemofdayRepo.deleteAll();
	}
	
	
	

}
