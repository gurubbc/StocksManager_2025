package com.ofss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StockService {

	// StockService depends on StockDAO
	@Autowired
	StockDAO stockDAO;
	
	public ResponseEntity<Object> addAStock(Stock newStock) {
		return stockDAO.addAStock(newStock);
	}
	
	public ResponseEntity<Object> fetchAllStocks() {
		return ResponseEntity.status(200).body(stockDAO.fetchAllStocks());
	}
	
	public ResponseEntity<Stock> fetchAStockById(int sid) {
		return stockDAO.fetchAStockById(sid);
	}
	
	public ResponseEntity<Object> deleteAStockById(int sid) {
		return stockDAO.deleteAStockById(sid);
	}
}
