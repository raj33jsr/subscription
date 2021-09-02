package com.subscription.sale.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.subscription.sale.domain.Subscription;

@FeignClient(value = "subscription", url = "http://localhost:9091/api/subscriptions/")
public interface SubscriptionClient {

	@RequestMapping(method = RequestMethod.GET, value = "{id}", produces = "application/json")
    Subscription getSubscriptionById(@PathVariable("id") Integer subscriptionId);
	
}
