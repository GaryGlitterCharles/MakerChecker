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

	public void update(Temperary temperary, Master master, String customerCode)
	{

		master = masterRepo.findByCustomerCode(customerCode);
		// temperary = tempRepo.findByCustomerCode(customerCode);
		//Temperary temperary2 = tempRepo.findByCustomerCode(customerCode);
		if (master == null)
		{
			temperary.setRecordStatus("N");
			tempRepo.save(temperary);

		}

//		else if (temperary.getRecordStatus().equals(""))
//		{
//			temperary.setRecordStatus("N");
//			tempRepo.save(temperary);
//		}
		else
		{
			temperary.setRecordStatus("M");
			tempRepo.save(temperary);
		}

//		if (master.getRecordStatus().equals("A"))
//		{
//			temperary.setRecordStatus("M");
//			tempRepo.save(temperary);
//		}
//		else {
//			temperary.setRecordStatus("N");
//			tempRepo.save(temperary);
//			
//		}

	}

	public void updates11(String customerCode, Model model, Temperary temperary, Master master)
	{
		tempRepo.findByCustomerCode(customerCode);
		masterRepo.findByCustomerCode(customerCode);
	}

	public Temperary up(String customerCode)
	{
		return tempRepo.findByCustomerCode(customerCode);
	}

	public Master upM(String customerCode)
	{
		return masterRepo.findByCustomerCode(customerCode);
	}

	public void modify(String customerCode, Model model, Temperary temperary, Master master)
	{

		temperary = tempRepo.findByCustomerCode(customerCode);
		master = masterRepo.findByCustomerCode(customerCode);
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
				temperary = new Temperary();
				master = masterRepo.findByCustomerCode(customerCode);
				temperary.setActiveInactiveFlag(master.getActiveInactiveFlag());
				temperary.setAuthorizedBy(master.getAuthorizedBy());
				temperary.setAuthorizedDate(master.getAuthorizedDate());
				temperary.setContactNumber(master.getContactNumber());
				temperary.setCreateDate(master.getCreateDate());
				temperary.setCreatedBy(master.getCreatedBy());
				temperary.setCustomerAddress1(master.getCustomerAddress1());
				temperary.setCustomerAddress2(master.getCustomerAddress2());
				temperary.setCustomerCode(master.getCustomerCode());
				temperary.setCustomerEmail(master.getCustomerEmail());
				temperary.setCustomerID(master.getCustomerID());
				temperary.setCustomerName(master.getCustomerName());
				temperary.setCustomerPincode(master.getCustomerPincode());
				temperary.setModifiedBy(master.getModifiedBy());
				temperary.setModifiedDate(master.getModifiedDate());
				temperary.setPrivateContactPerson(master.getPrivateContactPerson());

				temperary.setRecordStatus("M");
				tempRepo.save(temperary);
			}
		}
	}

	public void updateModify(Temperary temperary, String customerCode)
	{
		temperary = tempRepo.findByCustomerCode(customerCode);

//		if(temperary.getRecordStatus().equals("MR"))
//		{
//			temperary.setRecordStatus("N");
//			tempRepo.save(temperary);
//		}

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
