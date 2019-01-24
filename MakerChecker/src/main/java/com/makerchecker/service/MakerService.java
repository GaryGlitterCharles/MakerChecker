package com.makerchecker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.makerchecker.domain.Master;
import com.makerchecker.domain.Temperary;
import com.makerchecker.repository.JpaRepoInterfaceTemp;
import com.makerchecker.repository.JpaRepositoryMaster;

@Service
public class MakerService
{
	@Autowired
	private JpaRepoInterfaceTemp tempRepo;

	@Autowired
	private JpaRepositoryMaster masterRepo;

	public void createRecord(Temperary tempRecord)
	{
		tempRecord.setRecordStatus("N");
		tempRepo.save(tempRecord);
	}

	public Temperary modify(String customerCode)
	{
		return tempRepo.findByCustomerCode(customerCode);

	}

	public void updateModify(Temperary temperary)
	{
		temperary.setRecordStatus("M");
		tempRepo.save(temperary);
	}

	public void hard_delete_fromTemp_table(String customerCode,Temperary temperary)
	{
		 temperary = tempRepo.findByCustomerCode(customerCode);
		tempRepo.delete(temperary);
	}

	public Temperary getRecordTE(String customerCode)
	{
		return tempRepo.findByCustomerCode(customerCode);
	}
	
	public Master getRecordMA(String customerCode)
	{
		return masterRepo.findByCustomerCode(customerCode);
		
	}
}
