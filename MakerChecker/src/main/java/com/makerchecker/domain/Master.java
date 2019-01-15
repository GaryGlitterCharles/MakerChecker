package com.makerchecker.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Master implements Serializable
{

	private static final long serialVersionUID = 864553065915510849L;
	private int customerID;
	private String customerCode;
	private String customerName;
	private String customerAddress1;
	private String customerAddress2;
	private int customerPincode;
	private String customerEmail;
	private String contactNumber;
	private String privateContactPerson;
	private String recordStatus;
	private String activeInactiveFlag;
	private Date createDate;
	private String createdBy;
	private String modifiedDate;
	private String modifiedBy;
	private String authorizedDate;
	private String authorizedBy;

	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
	public int getCustomerID()
	{
		return customerID;
	}

	public void setCustomerID(int customerID)
	{

		this.customerID = customerID;
	}
	@Id
	public String getCustomerCode()
	{
		return customerCode;
	}

	public void setCustomerCode(String customerCode)
	{
		this.customerCode = customerCode;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerAddress1()
	{
		return customerAddress1;
	}

	public void setCustomerAddress1(String customerAddress1)
	{
		this.customerAddress1 = customerAddress1;
	}

	public String getCustomerAddress2()
	{
		return customerAddress2;
	}

	public void setCustomerAddress2(String customerAddress2)
	{
		this.customerAddress2 = customerAddress2;
	}

	public int getCustomerPincode()
	{
		return customerPincode;
	}

	public void setCustomerPincode(int customerPincode)
	{
		this.customerPincode = customerPincode;
	}

	public String getCustomerEmail()
	{
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail)
	{
		this.customerEmail = customerEmail;
	}

	public String getContactNumber()
	{
		return contactNumber;
	}

	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}

	public String getPrivateContactPerson()
	{
		return privateContactPerson;
	}

	public void setPrivateContactPerson(String privateContactPerson)
	{
		this.privateContactPerson = privateContactPerson;
	}

	public String getRecordStatus()
	{
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus)
	{
		this.recordStatus = recordStatus;
	}

	public String getActiveInactiveFlag()
	{
		return activeInactiveFlag;
	}

	public void setActiveInactiveFlag(String activeInactiveFlag)
	{
		this.activeInactiveFlag = activeInactiveFlag;
	}

	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	public String getModifiedDate()
	{
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate)
	{
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy()
	{
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}

	public String getAuthorizedDate()
	{
		return authorizedDate;
	}

	public void setAuthorizedDate(String authorizedDate)
	{
		this.authorizedDate = authorizedDate;
	}

	public String getAuthorizedBy()
	{
		return authorizedBy;
	}

	public void setAuthorizedBy(String authorizedBy)
	{
		this.authorizedBy = authorizedBy;
	}

}
