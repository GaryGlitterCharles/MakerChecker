package com.makerchecker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.makerchecker.domain.Temperary;
import com.makerchecker.repository.JpaRepoInterfaceTemp;

@Service
public class MakerService
{
	@Autowired
	private JpaRepoInterfaceTemp tempRepo;

	public void createRecord(Temperary tempRecord)
	{
		tempRecord.setRecordStatus("N");
		tempRepo.save(tempRecord);
	}

	public void modify(Temperary temperary,String customerCode,Model model)
	{
		model.addAttribute("toModify", tempRepo.findByCustomerCode(customerCode));
		
	}

	
}
