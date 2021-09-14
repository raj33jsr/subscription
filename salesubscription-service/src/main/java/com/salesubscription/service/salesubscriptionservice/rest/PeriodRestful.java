package com.salesubscription.service.salesubscriptionservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
>>>>>>> b30674e7e38e26421c22329441168b65ac5c393e
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesubscription.service.salesubscriptionservice.domain.Period;
import com.salesubscription.service.salesubscriptionservice.domain.Subscription;
import com.salesubscription.service.salesubscriptionservice.service.impl.PeriodImpl;
import com.salesubscription.service.salesubscriptionservice.service.impl.SubscriptionImpl;

@RestController
@RequestMapping("/api/subscriptions/period/")
public class PeriodRestful {
	
	@Autowired
	private PeriodImpl periodImpl;
	
	@Autowired
	private SubscriptionImpl subsImpl;
	
	@GetMapping("{periodId}")
	public Period getPeriodById(@PathVariable(name="periodId") Integer periodId) {
		return periodImpl.getPeriod(periodId);
	}
	
	@PostMapping("")
<<<<<<< HEAD
	public void savePeriod(@RequestBody Period period) {
		Subscription sub = subsImpl.getSubscriptionById(period.getSubscriptionId());
		period.setSubscription(sub);
		periodImpl.savePeriod(period);
=======
	public ResponseEntity<Period> savePeriod(@RequestBody Period period) {
		Subscription sub = subsImpl.getSubscriptionById(period.getSubscriptionId());
		period.setSubscription(sub);
		Period periodResp = periodImpl.savePeriod(period);
		return new ResponseEntity<Period>(periodResp,HttpStatus.CREATED);
>>>>>>> b30674e7e38e26421c22329441168b65ac5c393e
	}
	
	
}
