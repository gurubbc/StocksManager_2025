package com.ofss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	
	// for adding a new customer
	@RequestMapping(value="/customers", method=RequestMethod.POST)
	public ResponseEntity<Object> addAStock(@RequestBody Customer newCustomer) {
		System.out.println("Adding a new customer called from the controller");
		return cs.addACustomer(newCustomer);
	}
	
	// for fetching all stocks
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public ResponseEntity<Object> fetchAllCustomers() {
		System.out.println("Fetching all customers called from the controller");
		return cs.fetchAllCustomers();
	}
	
	// for fetching a customer by id
	@RequestMapping(value="/customers/{custId}", method=RequestMethod.GET)
	public ResponseEntity<Object> fetchACustomerById(@PathVariable("custId") int cid) {
		System.out.println("Fetching a customer by id called from the controller");
		return cs.fetchACustomerById(cid);
	}
	
	// delete by id
	@RequestMapping(value="/customers/{custId}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteACustomerById(@PathVariable("custId") int cid) {
		System.out.println("Deleting a customer by id called from the controller");
		return cs.deleteACustomerById(cid);
	}
	
	// update by id - assignment
}
