package com.sba3.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sba3.dao.CustdetDAO;
import com.sba3.model.CustomerModel;



@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustdetDAO cusdao;

	@Override
	public CustomerModel addCustomer(CustomerModel cust) {
		return cusdao.save(cust);
	}

	@Override
	public List<CustomerModel> getAllCustomers() {
		return cusdao.findAll();
	}



}
