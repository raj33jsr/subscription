package com.subscription.sale.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subscription.sale.dao.SubscriptionSalesDao;
import com.subscription.sale.domain.SubscriptionSales;

@Service
public class SubscriptionSalesService {

	@Autowired
	private SubscriptionSalesDao subscriptionSalesDao;
	
	public SubscriptionSales createSubscriptionSales(SubscriptionSales subscriptionSales) {
		throw new RuntimeException();
		//SubscriptionSales subscriptionSalesResp = subscriptionSalesDao.save(subscriptionSales);
		//return subscriptionSalesResp;
	}
	
	public SubscriptionSales getSubscriptionSalesById(Integer saleId) {
		Optional<SubscriptionSales> subscriptionSales = subscriptionSalesDao.findById(saleId);
			SubscriptionSales subscriptionSalesResp = subscriptionSales.get();
			return subscriptionSalesResp;
	}
}
