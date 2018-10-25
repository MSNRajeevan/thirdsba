package com.sba3.service;


import java.util.List;

import com.sba3.model.CustomerModel;





public interface CustomerService {
	
	CustomerModel addCustomer(CustomerModel cust);
	List<CustomerModel> getAllCustomers();
	

}
