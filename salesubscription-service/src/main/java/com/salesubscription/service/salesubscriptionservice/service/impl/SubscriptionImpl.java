/**
 * 
 */
package com.salesubscription.service.salesubscriptionservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesubscription.service.salesubscriptionservice.dao.SubscriptionDao;
import com.salesubscription.service.salesubscriptionservice.domain.Subscription;



/**
 * @author mahanraj
 *
 */
@Service
public class SubscriptionImpl {
	
	@Autowired
	private SubscriptionDao subscriptionDao;
	
	public List<Subscription> getSubscriptions(){
		List<Subscription> subscriptions = subscriptionDao.findAll();
		return subscriptions;
	}
	
	public Subscription getSubscriptionById(Integer subscriptionId){
		Optional<Subscription> subscription = subscriptionDao.findById(subscriptionId);
		return subscription.get();
	}
	
}

