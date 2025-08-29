package com.ofss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StocksManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksManagerApplication.class, args);
		System.out.println("Stock Manager Started....");
	}

}
