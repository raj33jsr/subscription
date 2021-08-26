<<<<<<< HEAD
=======
/**
 * 
 */
>>>>>>> subscription-Rajesh
package com.salesubscription.service.salesubscriptionservice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.FetchType;
=======
>>>>>>> subscription-Rajesh
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

<<<<<<< HEAD
@Entity
@Table(name = "period")
public class Period {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "period_id")
	private Integer periodId;
	
	
	@Column(name = "subscription_id")
=======
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
>>>>>>> subscription-Rajesh
	private Integer subscriptionId;
	
	@Column(name = "from")
	@Temporal(TemporalType.DATE)
	private Date from;
	
	@Column(name = "until")
	@Temporal(TemporalType.DATE)
	private Date until;
	
	@Column(name = "createdtimestamp")
	@Temporal(TemporalType.DATE)
<<<<<<< HEAD
	private Date createdTimestamp;
=======
	private Date createdTimeStamp;
>>>>>>> subscription-Rajesh
	
	@Column(name = "external_id")
	private String externalId;
	
<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name="subscriptionid")
	private Subscription subscription;

=======
	@Column(name = "custommessage")
	private String customMessage;
	
	@ManyToOne
	
	@JoinColumn(name="subscription_id",insertable=false, updatable=false)
	
	private Subscription subscription;

	/**
	 * @return the periodId
	 */
>>>>>>> subscription-Rajesh
	public Integer getPeriodId() {
		return periodId;
	}

<<<<<<< HEAD
=======
	/**
	 * @param periodId the periodId to set
	 */
>>>>>>> subscription-Rajesh
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the subscriptionId
	 */
>>>>>>> subscription-Rajesh
	public Integer getSubscriptionId() {
		return subscriptionId;
	}

<<<<<<< HEAD
=======
	/**
	 * @param subscriptionId the subscriptionId to set
	 */
>>>>>>> subscription-Rajesh
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the from
	 */
>>>>>>> subscription-Rajesh
	public Date getFrom() {
		return from;
	}

<<<<<<< HEAD
=======
	/**
	 * @param from the from to set
	 */
>>>>>>> subscription-Rajesh
	public void setFrom(Date from) {
		this.from = from;
	}

<<<<<<< HEAD
=======
	/**
	 * @return the until
	 */
>>>>>>> subscription-Rajesh
	public Date getUntil() {
		return until;
	}

<<<<<<< HEAD
=======
	/**
	 * @param until the until to set
	 */
>>>>>>> subscription-Rajesh
	public void setUntil(Date until) {
		this.until = until;
	}

<<<<<<< HEAD
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

=======
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
>>>>>>> subscription-Rajesh
	public String getExternalId() {
		return externalId;
	}

<<<<<<< HEAD
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	

=======
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
>>>>>>> subscription-Rajesh
	public Subscription getSubscription() {
		return subscription;
	}

<<<<<<< HEAD
=======
	/**
	 * @param subscription the subscription to set
	 */
>>>>>>> subscription-Rajesh
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "Period [periodId=" + periodId + ", subscriptionId=" + subscriptionId + ", from=" + from + ", until="
<<<<<<< HEAD
				+ until + ", createdTimestamp=" + createdTimestamp + ", externalId=" + externalId + "]";
	}
=======
				+ until + ", createdTimeStamp=" + createdTimeStamp + ", externalId=" + externalId + ", customMessage="
				+ customMessage + ", subscription=" + subscription + "]";
	}

	
	
>>>>>>> subscription-Rajesh
	
}
