package com.nxeas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Tables;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
 
@javax.persistence.Entity
@Table(name="customer1")
public class Customer implements Serializable {
	@Id
	@Column(name="CUSTOMERID")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="SEQ")
	@SequenceGenerator(name="SEQ",sequenceName="CUSTOMER_SEQ")
	private int customerId;
	@NotEmpty(message="Not be null")
	@Length(max=10 ,message="CustomerName must be lessthan 10 characters")
	@Column(name="CUSTOMERNAME")
	private String customerName;
	@Length(max=10 ,message="Product must be lessthan 10 characters")
	@Column(name="PRODUCT")
	private String product;
	@Email
	@Length(max=30 ,message="MailId must be lessthan 30 characters")
	@Column(name="MAILID")
	private String mailID;
	@Column(name="ADDRESS")
	@Length(max=30 ,message="Address must be lessthan 30 characters")
	private String address;
	@NotEmpty
	@Length(max=10 ,message="PhoneNumber must be lessthan 10 characters")
	@Column(name="PHONENUMBER")
	private String phoneNumber;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getmailID() {
		return mailID;
	}
	public void setmailID(String mailID) {
		this.mailID = mailID;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/*
	public Customer(){
		
	}
	
	public Customer(int customerId, String customerName, String fName,
			String mName, String lName, String phoneNumber,
			String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.customerAddress = customerAddress;
	}*/

}
