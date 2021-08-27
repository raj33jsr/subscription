/**
 * 
 */
package com.salesubscription.service.salesubscriptionservice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author mahanraj
 *
 */
@Entity
@Table(name = "period")
public class Period {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "period_id")
	private Integer periodId;
	
	@Column(name ="subscription_id")
	private Integer subscriptionId;
	
	@Column(name = "from")
	@Temporal(TemporalType.DATE)
	private Date from;
	
	@Column(name = "until")
	@Temporal(TemporalType.DATE)
	private Date until;
	
	@Column(name = "createdtimestamp")
	@Temporal(TemporalType.DATE)
	private Date createdTimeStamp;
	
	@Column(name = "external_id")
	private String externalId;
	
	@Column(name = "custommessage")
	private String customMessage;
	
	@ManyToOne
	
	@JoinColumn(name="subscription_id",insertable=false, updatable=false)
	
	private Subscription subscription;

	/**
	 * @return the periodId
	 */
	public Integer getPeriodId() {
		return periodId;
	}

	/**
	 * @param periodId the periodId to set
	 */
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

	/**
	 * @return the subscriptionId
	 */
	public Integer getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * @param subscriptionId the subscriptionId to set
	 */
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	/**
	 * @return the from
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(Date from) {
		this.from = from;
	}

	/**
	 * @return the until
	 */
	public Date getUntil() {
		return until;
	}

	/**
	 * @param until the until to set
	 */
	public void setUntil(Date until) {
		this.until = until;
	}

	/**
	 * @return the createdTimeStamp
	 */
	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	/**
	 * @param createdTimeStamp the createdTimeStamp to set
	 */
	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	/**
	 * @return the externalId
	 */
	public String getExternalId() {
		return externalId;
	}

	/**
	 * @param externalId the externalId to set
	 */
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * @return the customMessage
	 */
	public String getCustomMessage() {
		return customMessage;
	}

	/**
	 * @param customMessage the customMessage to set
	 */
	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}
	
	
	

	/**
	 * @return the subscription
	 */
	@JsonIgnore
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * @param subscription the subscription to set
	 */
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "Period [periodId=" + periodId + ", subscriptionId=" + subscriptionId + ", from=" + from + ", until="
				+ until + ", createdTimeStamp=" + createdTimeStamp + ", externalId=" + externalId + ", customMessage="
				+ customMessage + ", subscription=" + subscription + "]";
	}

	
	
	
}
