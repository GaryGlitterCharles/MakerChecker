package com.makerchecker.service;

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

	public void authorizeRecord(Temperary temperary, String customerCode)
	{
		Temperary temperaryRec = tempRepo.findByCustomerCode(customerCode);

		Master master = new Master();
		master.setCustomerID(temperaryRec.getCustomerID());
		master.setActiveInactiveFlag(temperaryRec.getActiveInactiveFlag());
		master.setAuthorizedBy(temperaryRec.getAuthorizedBy());
		master.setAuthorizedDate(temperaryRec.getAuthorizedDate());
		master.setContactNumber(temperaryRec.getContactNumber());
		master.setCreateDate(temperaryRec.getCreateDate());
		master.setCreatedBy(temperaryRec.getCreatedBy());
		master.setCustomerAddress1(temperaryRec.getCustomerAddress1());
		master.setCustomerAddress2(temperaryRec.getCustomerAddress2());
		master.setCustomerCode(temperaryRec.getCustomerCode());
		master.setCustomerEmail(temperaryRec.getCustomerEmail());
		master.setCustomerName(temperaryRec.getCustomerName());
		master.setCustomerPincode(temperaryRec.getCustomerPincode());
		master.setModifiedBy(temperaryRec.getModifiedBy());
		master.setModifiedDate(temperaryRec.getModifiedDate());
		master.setPrivateContactPerson(temperaryRec.getPrivateContactPerson());
		master.setRecordStatus("A");
		masterRepo.save(master);
		tempRepo.delete(temperaryRec);
	}
}
