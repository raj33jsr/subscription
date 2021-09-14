package com.subscription.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SubscriptionSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionSaleApplication.class, args);
	}

}
