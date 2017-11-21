package com.naxes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nxeas.dao.CustomerDAO;
import com.nxeas.model.Customer;
import com.nxeas.service.CustomerService;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	@Qualifier(value="customerDAO")
	private CustomerDAO customerDAO;
	
	public void setCustomerDAO(CustomerDAO customerDAO){
		this.customerDAO=customerDAO;
	}
	

	@Transactional
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to MR./MRS"+customer.getCustomerName());
		customerDAO.add(customer);
		
	}

	@Transactional
	public void edit(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.edit(customer);
		
	}

	@Transactional
	public void delete(int customerId) {
		// TODO Auto-generated method stub
		customerDAO.delete(customerId);
		
	}

	@Transactional
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(customerId);
	}

	@Transactional
	public List getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getAllCustomers();
	}

}
