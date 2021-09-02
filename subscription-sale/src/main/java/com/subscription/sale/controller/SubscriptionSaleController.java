package com.subscription.sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subscription.sale.domain.Subscription;
import com.subscription.sale.domain.SubscriptionSales;
import com.subscription.sale.service.SubscriptionClient;

@RestController
@RequestMapping("/api/subscription/sales/")
public class SubscriptionSaleController {

	@Autowired
	private SubscriptionClient subscriptionClient;
	
	
	@GetMapping("{saleId}")
	public ResponseEntity<SubscriptionSales> getSubscriptionSalesById(@PathVariable(name = "saleId") Integer saleId) {
		Subscription subscription = subscriptionClient.getSubscriptionById(saleId);
		SubscriptionSales subscriptionSales = new SubscriptionSales();
		subscriptionSales.setSubscriptionId(subscription.getSubscriptionid());
		return new ResponseEntity<SubscriptionSales>(subscriptionSales,HttpStatus.OK);
	}
	
}
