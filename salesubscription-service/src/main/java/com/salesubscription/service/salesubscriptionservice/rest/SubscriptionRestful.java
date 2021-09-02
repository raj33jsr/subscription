/**
 * 
 */
package com.salesubscription.service.salesubscriptionservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesubscription.service.salesubscriptionservice.common.ServiceConstant;
import com.salesubscription.service.salesubscriptionservice.domain.Subscription;
import com.salesubscription.service.salesubscriptionservice.exception.BadRequestException;
import com.salesubscription.service.salesubscriptionservice.exception.ResourceNotFoundException;
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
	public ResponseEntity<List<Subscription>> getSubscriptions(){
		List<Subscription> subscriptions = subscriptionImpl.getSubscriptions();
		return new ResponseEntity<List<Subscription>>(subscriptions,HttpStatus.OK);
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Subscription> getSubscriptionById(@PathVariable(name = "id") Integer id){
		try {
			Subscription subscription = subscriptionImpl.getSubscriptionById(id);
			return new ResponseEntity<Subscription>(subscription,HttpStatus.OK);
		}	catch(ResourceNotFoundException rne) {
			throw new ResourceNotFoundException(rne.getErrorCode(),rne.getMessage());
		}
	}
	
	
	@PostMapping(path = "")
	public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription subscription) {
		Subscription sbscriptionResp = subscriptionImpl.createSubscription(subscription);
		return new ResponseEntity<Subscription>(sbscriptionResp,HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public Subscription updateSubscriptionById(@PathVariable(name="id") Integer id , @RequestBody Subscription subscription) {
		try {
			if(id != subscription.getSubscriptionid()) {
				throw new BadRequestException(ServiceConstant.SUBSCRIPTION_ID_MISSMATCH, "id and subscription id is different");
			}
		Subscription sbscriptionResp = subscriptionImpl.updateSubscriptionById(id,subscription);
		return sbscriptionResp;
		}catch(ResourceNotFoundException rne) {
			throw new ResourceNotFoundException(rne.getErrorCode(),rne.getMessage());
		}
	}

}
