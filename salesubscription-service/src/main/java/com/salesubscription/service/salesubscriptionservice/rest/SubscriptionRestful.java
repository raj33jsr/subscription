/**
 * 
 */
package com.salesubscription.service.salesubscriptionservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesubscription.service.salesubscriptionservice.domain.Subscription;
import com.salesubscription.service.salesubscriptionservice.service.impl.SubscriptionImpl;

/**
 * @author mahanraj
 *
 */
@RestController
@RequestMapping("/api/subscriptions/")
public class SubscriptionRestful {
	
	@Autowired
	private SubscriptionImpl subscriptionImpl;
	
	@GetMapping(path = "")
	public List<Subscription> getSubscriptions(){
		List<Subscription> subscriptions = subscriptionImpl.getSubscriptions();
		return subscriptions;
	}

}
