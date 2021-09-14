/**
 * 
 */
package com.salesubscription.service.salesubscriptionservice.service.impl;

import java.util.List;
import java.util.Optional;
<<<<<<< HEAD
=======

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;
>>>>>>> b30674e7e38e26421c22329441168b65ac5c393e

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesubscription.service.salesubscriptionservice.common.ServiceConstant;
import com.salesubscription.service.salesubscriptionservice.dao.SubscriptionDao;
import com.salesubscription.service.salesubscriptionservice.domain.Subscription;
import com.salesubscription.service.salesubscriptionservice.exception.ResourceNotFoundException;



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
<<<<<<< HEAD
		Optional<Subscription> subs = subscriptionDao.findById(subscriptionId);
		return subs.get();
=======
		Optional<Subscription> subscription = subscriptionDao.findById(subscriptionId);
		if(subscription.isPresent()) {
			Subscription subscriptionResp = subscription.get();
			return subscriptionResp;
		}else {
			throw new ResourceNotFoundException(ServiceConstant.SUBSCRIPTION_NOT_AVAILABLE,"subscription not available ");
		}
		
	}
	
	public Subscription createSubscription(Subscription sbscription) {
		Subscription sbscriptionResp = subscriptionDao.save(sbscription);
		return sbscriptionResp;
	}
	@Transactional(value = TxType.REQUIRED)
	public Subscription updateSubscriptionById( Integer subscriptionId ,Subscription subscription) {
		Optional<Subscription> optionalSubscription = subscriptionDao.findById(subscriptionId);
		if(optionalSubscription.isPresent()) {
			Subscription subscriptionResp = optionalSubscription.get();
		}else {
			throw new ResourceNotFoundException(ServiceConstant.SUBSCRIPTION_NOT_AVAILABLE,"subscription not available ");
		}
		Subscription subscriptionResp =  subscriptionDao.save(subscription);
		return subscriptionResp;
	}
	
>>>>>>> b30674e7e38e26421c22329441168b65ac5c393e
	}

