package com.salesubscription.service.salesubscriptionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.salesubscription.service.salesubscriptionservice.domain")
@SpringBootApplication
public class SalesubscriptionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesubscriptionServiceApplication.class, args);
	}

}
