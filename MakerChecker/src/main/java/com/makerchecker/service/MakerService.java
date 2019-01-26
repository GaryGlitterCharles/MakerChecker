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

	public void modify(String customerCode, Model model)
	{

		Temperary temperary = tempRepo.findByCustomerCode(customerCode);
		Master master = masterRepo.findByCustomerCode(customerCode);

		// model.addAttribute("toModify", temperary);
		model.addAttribute("toModify", master);

		if (master == null)
		{
			model.addAttribute("toModify", temperary);
			tempRepo.save(temperary);
		}

		else
		{

			if (master.getRecordStatus().equals("A"))
			{
				Temperary temperary2 = new Temperary();
				Master master1 = masterRepo.findByCustomerCode(customerCode);
				temperary2.setActiveInactiveFlag(master1.getActiveInactiveFlag());
				temperary2.setAuthorizedBy(master1.getAuthorizedBy());
				temperary2.setAuthorizedDate(master1.getAuthorizedDate());
				temperary2.setContactNumber(master1.getContactNumber());
				temperary2.setCreateDate(master1.getCreateDate());
				temperary2.setCreatedBy(master1.getCreatedBy());
				temperary2.setCustomerAddress1(master1.getCustomerAddress1());
				temperary2.setCustomerAddress2(master1.getCustomerAddress2());
				temperary2.setCustomerCode(master1.getCustomerCode());
				temperary2.setCustomerEmail(master1.getCustomerEmail());
				temperary2.setCustomerID(master1.getCustomerID());
				temperary2.setCustomerName(master1.getCustomerName());
				temperary2.setCustomerPincode(master1.getCustomerPincode());
				temperary2.setModifiedBy(master1.getModifiedBy());
				temperary2.setModifiedDate(master1.getModifiedDate());
				temperary2.setPrivateContactPerson(master1.getPrivateContactPerson());

				temperary2.setRecordStatus("M");
				tempRepo.save(temperary2);
			}
		}
	}

	public void updateModify(Temperary temperary,String customerCode)
	{
		 temperary = tempRepo.findByCustomerCode(customerCode);
		if (temperary.getRecordStatus().equals("N"))
		{
			
			temperary.setRecordStatus("N");
			tempRepo.save(temperary);

		}

		else
		{

			temperary.setRecordStatus("M");
			tempRepo.save(temperary);
		}

	}

	public void hard_delete_fromTemp_table(String customerCode, Master master)
	{
		master = masterRepo.findByCustomerCode(customerCode);
		Temperary temperary2 = new Temperary();
		temperary2.setActiveInactiveFlag(master.getActiveInactiveFlag());
		temperary2.setAuthorizedBy(master.getAuthorizedBy());
		temperary2.setAuthorizedDate(master.getAuthorizedDate());
		temperary2.setContactNumber(master.getContactNumber());
		temperary2.setCreateDate(master.getCreateDate());
		temperary2.setCreatedBy(master.getCreatedBy());
		temperary2.setCustomerAddress1(master.getCustomerAddress1());
		temperary2.setCustomerAddress2(master.getCustomerAddress2());
		temperary2.setCustomerCode(master.getCustomerCode());
		temperary2.setCustomerEmail(master.getCustomerEmail());
		temperary2.setCustomerID(master.getCustomerID());
		temperary2.setCustomerName(master.getCustomerName());
		temperary2.setCustomerPincode(master.getCustomerPincode());
		temperary2.setModifiedBy(master.getModifiedBy());
		temperary2.setModifiedDate(master.getModifiedDate());
		temperary2.setPrivateContactPerson(master.getPrivateContactPerson());

		temperary2.setRecordStatus("D");
		tempRepo.save(temperary2);

	}

	public void hard_delete_fromTemp_table1(String customerCode, Temperary temperary)
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
