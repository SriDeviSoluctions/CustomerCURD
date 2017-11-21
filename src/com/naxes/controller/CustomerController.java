package com.naxes.controller;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nxeas.model.Customer;
import com.nxeas.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	@Qualifier(value="customerService")
	private CustomerService customerService;
    
	@RequestMapping("/index")
	public String setupForm(Map<String,Object> map){
		Customer customer=new Customer();
		Collections.reverse(customerService.getAllCustomers());
		map.put("customer",customer);
		map.put("customerList",customerService.getAllCustomers());
		return "customer";
		 
	}
	@RequestMapping(value="/customer.do",method=RequestMethod.POST)
	public String doActions(@Valid @ModelAttribute("customer") Customer customer,BindingResult result,@RequestParam String action,Map<String,Object> map,HttpServletRequest req){
		Customer customerResult=new Customer();
		Collections.reverse(customerService.getAllCustomers());
		
		if(action.toLowerCase().equals("add")){
			if(result.hasErrors()){
				System.out.println(req.getParameter("customerId"));
				System.out.println("errors");
				map.put("customerList",customerService.getAllCustomers());
				return "customer1";
			}
			customerService.add(customer);
			customerResult=customer;
		}
		else if(action.toLowerCase().equals("edit")){
			if(result.hasErrors()){
				System.out.println("errors");
				map.put("customerList",customerService.getAllCustomers());
				return "customer1";
			}
			customerService.edit(customer);
			customerResult=customer;
		}
		else if(action.toLowerCase().equals("delete")){
			customerService.delete(customer.getCustomerId());
			customerResult=customer;
	    }
		else if(action.toLowerCase().equals("search")){
			Customer searchCustomer=customerService.getCustomer(customer.getCustomerId());
			customerResult=searchCustomer!=null ? searchCustomer:new Customer();
		}
		
		map.put("customer",customerResult);
		map.put("customerList",customerService.getAllCustomers());
		return "customer";
	}  

}
