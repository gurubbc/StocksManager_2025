package com.ofss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	// StockService depends on StockDAO
	@Autowired
	CustomerDAO customerDAO;
	
	public ResponseEntity<Object> addACustomer(Customer newCustomer) {
		return customerDAO.addACustomer(newCustomer);
	}
	
	public ResponseEntity<Object> fetchAllCustomers() {
		return ResponseEntity.status(200).body(customerDAO.fetchAllCustomers());
	}
	
	public ResponseEntity<Object> fetchACustomerById(int cid) {
		return customerDAO.fetchACustomerById(cid);
	}
	
	public ResponseEntity<Object> deleteACustomerById(int cid) {
		return customerDAO.deleteACustomerById(cid);
	}
}
