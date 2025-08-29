package com.ofss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@Autowired
	StockService ss;
	
	
	// for adding a new stock
	@RequestMapping(value="/stocks", method=RequestMethod.POST)
	public ResponseEntity<Object> addAStock(@RequestBody Stock newStock) {
		System.out.println("Adding a new stock called from the controller");
		return ss.addAStock(newStock);
	}
	
	// for fetching all stocks
	@RequestMapping(value="/stocks", method=RequestMethod.GET)
	public ResponseEntity<Object> fetchAllStocks() {
		System.out.println("Fetching all stocks called from the controller");
		return ss.fetchAllStocks();
	}
	
	// for fetching a stock by id
	@RequestMapping(value="/stocks/{stockId}", method=RequestMethod.GET)
	public ResponseEntity<Stock> fetchAStockById(@PathVariable("stockId") int sid) {
		System.out.println("Fetching a stock by id called from the controller");
		return ss.fetchAStockById(sid);
	}
	
	// delete by id
	@RequestMapping(value="/stocks/{stockId}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteAStockById(@PathVariable("stockId") int sid) {
		System.out.println("Deleting a stock by id called from the controller");
		return ss.deleteAStockById(sid);
	}
	
	// update by id - assignment
}
