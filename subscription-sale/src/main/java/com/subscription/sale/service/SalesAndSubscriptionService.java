package com.subscription.sale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subscription.sale.domain.SalesAndSubscription;
import com.subscription.sale.domain.Subscription;
import com.subscription.sale.domain.SubscriptionSales;
import com.subscription.sale.integration.SubscriptionClient;

@Service
public class SalesAndSubscriptionService {
	
	@Autowired
	private SubscriptionClient subscriptionClient;
	
	@Autowired
	private SubscriptionSalesService subscriptionSalesService;
	
	public SalesAndSubscription createSalesAndSubscription(SalesAndSubscription salesAndSubscription) {
		
		SubscriptionSales subscriptionSalesResp = subscriptionSalesService.createSubscriptionSales(salesAndSubscription.getSubscriptionSales());
		Subscription subscriptionResp =  subscriptionClient.createSubscription(salesAndSubscription.getSubscription());		
		SalesAndSubscription salesAndSubscriptionResp = new SalesAndSubscription();
		salesAndSubscriptionResp.setSubscription(subscriptionResp);
		salesAndSubscriptionResp.setSubscriptionSales(subscriptionSalesResp);
		return salesAndSubscriptionResp;
		
	}
	
	public SalesAndSubscription getSalesAndSubscriptionById(Integer salesId) {
		
		SubscriptionSales subscriptionSalesResp = subscriptionSalesService.getSubscriptionSalesById(salesId);
		Subscription subscriptionResp = subscriptionClient.getSubscriptionById(subscriptionSalesResp.getSubscriptionId());
		SalesAndSubscription salesAndSubscriptionResp = new SalesAndSubscription();
		salesAndSubscriptionResp.setSubscription(subscriptionResp);
		salesAndSubscriptionResp.setSubscriptionSales(subscriptionSalesResp);
		return salesAndSubscriptionResp;
	}	
}
