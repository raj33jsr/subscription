package com.salesubscription.service.salesubscriptionservice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "period")
public class Period {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "period_id")
	private Integer periodId;
	
	
	@Column(name = "subscription_id")
	private Integer subscriptionId;
	
	@Column(name = "from")
	@Temporal(TemporalType.DATE)
	private Date from;
	
	@Column(name = "until")
	@Temporal(TemporalType.DATE)
	private Date until;
	
	@Column(name = "createdtimestamp")
	@Temporal(TemporalType.DATE)
	private Date createdTimestamp;
	
	@Column(name = "external_id")
	private String externalId;
	
	@ManyToOne
	private Subscription subscription;

	public Integer getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

	public Integer getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getUntil() {
		return until;
	}

	public void setUntil(Date until) {
		this.until = until;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "Period [periodId=" + periodId + ", subscriptionId=" + subscriptionId + ", from=" + from + ", until="
				+ until + ", createdTimestamp=" + createdTimestamp + ", externalId=" + externalId + "]";
	}
	
}
