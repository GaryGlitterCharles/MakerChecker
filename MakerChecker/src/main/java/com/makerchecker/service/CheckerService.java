package com.makerchecker.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.makerchecker.domain.Master;
import com.makerchecker.domain.Temperary;
import com.makerchecker.repository.JpaRepoInterfaceTemp;
import com.makerchecker.repository.JpaRepositoryMaster;

@Service
public class CheckerService
{

	@Autowired
	private JpaRepoInterfaceTemp tempRepo;

	@Autowired
	private JpaRepositoryMaster masterRepo;

	public List<Temperary> getAllRecords()
	{
		return tempRepo.findAll();
	}

	public void authorizeRecord(Temperary temperary, String customerCode, Master master)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

		temperary = tempRepo.findByCustomerCode(customerCode);
		master = masterRepo.findByCustomerCode(customerCode);
		

		
		
		
		if ((masterRepo.findByCustomerCode(customerCode) == null))
		{
			Master master2 = new Master();

			master2.setCustomerID(temperary.getCustomerID());
			master2.setActiveInactiveFlag(temperary.getActiveInactiveFlag());
			master2.setAuthorizedBy(temperary.getAuthorizedBy());
			master2.setAuthorizedDate(dateFormat.format(date));
			master2.setContactNumber(temperary.getContactNumber());
			master2.setCreateDate(temperary.getCreateDate());
			master2.setCreatedBy(temperary.getCreatedBy());
			master2.setCustomerAddress1(temperary.getCustomerAddress1());
			master2.setCustomerAddress2(temperary.getCustomerAddress2());
			master2.setCustomerCode(temperary.getCustomerCode());
			master2.setCustomerEmail(temperary.getCustomerEmail());
			master2.setCustomerName(temperary.getCustomerName());
			master2.setCustomerPincode(temperary.getCustomerPincode());
			master2.setModifiedBy(temperary.getModifiedBy());
			master2.setModifiedDate(temperary.getModifiedDate());
			master2.setPrivateContactPerson(temperary.getPrivateContactPerson());
			master2.setRecordStatus("A");
			masterRepo.save(master2);
			tempRepo.delete(temperary);
		} 
		else
		{
			
			master.setCustomerID(temperary.getCustomerID());
			master.setActiveInactiveFlag(temperary.getActiveInactiveFlag());
			master.setAuthorizedBy(temperary.getAuthorizedBy());
			master.setAuthorizedDate(dateFormat.format(date));
			master.setContactNumber(temperary.getContactNumber());
			master.setCreateDate(temperary.getCreateDate());
			master.setCreatedBy(temperary.getCreatedBy());
			master.setCustomerAddress1(temperary.getCustomerAddress1());
			master.setCustomerAddress2(temperary.getCustomerAddress2());
			master.setCustomerCode(temperary.getCustomerCode());
			master.setCustomerEmail(temperary.getCustomerEmail());
			master.setCustomerName(temperary.getCustomerName());
			master.setCustomerPincode(temperary.getCustomerPincode());
			master.setModifiedBy(temperary.getModifiedBy());
			master.setModifiedDate(temperary.getModifiedDate());
			master.setPrivateContactPerson(temperary.getPrivateContactPerson());
			master.setRecordStatus("A");
			masterRepo.save(master);
			tempRepo.delete(temperary);
		}
		
		if(temperary.getRecordStatus().equals("D"))
		{
			tempRepo.delete(temperary);
			masterRepo.delete(master);
		}


	}

	public void reject(String customerCode)
	{
		Temperary temperary = tempRepo.findByCustomerCode(customerCode);
		if(temperary.getRecordStatus().equals("M"))
		{
			temperary.setRecordStatus("MR");
			tempRepo.save(temperary);
		}
		else if(temperary.getRecordStatus().equals("D"))
		{
			temperary.setRecordStatus("DR");
			tempRepo.save(temperary);
		}
		
		
		else {
			
			temperary.setRecordStatus("NR");
			tempRepo.save(temperary);
		}
	
	}
}
