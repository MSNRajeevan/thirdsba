package com.sba3.restapi;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sba3.model.CustomerModel;
import com.sba3.service.CustomerService;





@RestController
@RequestMapping(value="/")
public class CustomerRestController {
	
	@Autowired
	private CustomerService cusserv;
	
	@GetMapping("/list")
	public ResponseEntity<List<CustomerModel>> getAllCustomers(){
		
		ResponseEntity<List<CustomerModel>> resp = null;
		
		List<CustomerModel> customers = cusserv.getAllCustomers();
		
		if(customers!=null)
			resp = new ResponseEntity<List<CustomerModel>>(customers, HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
		return resp;
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<CustomerModel> addCustomer(@RequestBody CustomerModel customer){
		
		ResponseEntity<CustomerModel> resp = null;
		
		resp = new ResponseEntity<>(cusserv.addCustomer(customer), HttpStatus.OK);
		
		return resp;
		
	}
}
