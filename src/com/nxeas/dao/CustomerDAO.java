package com.nxeas.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.nxeas.model.Customer;

public interface CustomerDAO {
	
	public void add(Customer customer);
	public void edit(Customer customer);
	public void delete(int customerId);
	public Customer getCustomer(int customerId);
	public List getAllCustomers();
	

}
