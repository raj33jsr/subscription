package com.subscription.sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subscription.sale.domain.SalesAndSubscription;
import com.subscription.sale.integration.SubscriptionClient;
import com.subscription.sale.service.SalesAndSubscriptionService;

@RestController
@RequestMapping("/api/subscription/sales/")
public class SubscriptionSaleController {

	@Autowired
	private SubscriptionClient subscriptionClient;
	
	
	@Autowired
	private SalesAndSubscriptionService salesAndSubscriptionService;
	
	@GetMapping("{saleId}")
	public ResponseEntity<SalesAndSubscription> getSalesAndSubscriptionById(@PathVariable(name = "saleId") Integer saleId) {
		SalesAndSubscription salesAndSubscriptionResp = salesAndSubscriptionService.getSalesAndSubscriptionById(saleId);
		return new ResponseEntity<SalesAndSubscription>(salesAndSubscriptionResp,HttpStatus.OK);
	}
	
	@PostMapping(path = "subscriptionandsales/")
	public ResponseEntity<SalesAndSubscription> createSubscription(@RequestBody SalesAndSubscription salesAndSubscription) {
		SalesAndSubscription salesAndSubscriptionResp = salesAndSubscriptionService.createSalesAndSubscription(salesAndSubscription);
		return new ResponseEntity<SalesAndSubscription>(salesAndSubscriptionResp,HttpStatus.CREATED);
	}
	
}
