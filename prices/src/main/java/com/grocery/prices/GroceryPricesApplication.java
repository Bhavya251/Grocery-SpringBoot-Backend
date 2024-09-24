package com.grocery.prices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GroceryPricesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryPricesApplication.class, args);
	}

}
