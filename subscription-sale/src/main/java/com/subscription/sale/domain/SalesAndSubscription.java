package com.subscription.sale.domain;

public class SalesAndSubscription {
	
	private Subscription subscription;
	
	private SubscriptionSales subscriptionSales;

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public SubscriptionSales getSubscriptionSales() {
		return subscriptionSales;
	}

	public void setSubscriptionSales(SubscriptionSales subscriptionSales) {
		this.subscriptionSales = subscriptionSales;
	}
	
	

}
