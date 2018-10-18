package com.cosmetic.dao;

import java.util.List;

import com.cosmetics.model.Customer;



public interface CustomerCosmetics {
	
		public boolean addCustomer(Customer customer);
		public boolean updateCustomer(Customer customer);
		public boolean deleteCustomer(Customer customer);
		public List <Customer> getAllCustomer();
		public Customer getCustomerById(String customerId);
		public Customer getCustomerByCustomerName(String customerEmail);
		public boolean validate(String email,String password);
   
}


