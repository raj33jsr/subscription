<<<<<<< HEAD
/**
 * 
 */
=======
>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
package com.salesubscription.service.salesubscriptionservice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.FetchType;
>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

<<<<<<< HEAD
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
	
	@Column(name = "fromdate")
	@Temporal(TemporalType.DATE)
	private Date fromDate;
	
	@Column(name = "todate")
	@Temporal(TemporalType.DATE)
	private Date toDate;
	
	@Column(name = "createdtimestamp")
	@Temporal(TemporalType.DATE)
	private Date createdTimeStamp;
=======
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
>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	
	@Column(name = "external_id")
	private String externalId;
	
<<<<<<< HEAD
	@Column(name = "custommessage")
	private String customMessage;
	
	@ManyToOne
	@JoinColumn(name="subscription_id",insertable=false, updatable=false)
	
	private Subscription subscription;

	/**
	 * @return the periodId
	 */
=======
	@ManyToOne
	@JoinColumn(name="subscriptionid")
	private Subscription subscription;

>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	public Integer getPeriodId() {
		return periodId;
	}

<<<<<<< HEAD
	/**
	 * @param periodId the periodId to set
	 */
=======
>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

<<<<<<< HEAD
	/**
	 * @return the subscriptionId
	 */
=======
>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	public Integer getSubscriptionId() {
		return subscriptionId;
	}

<<<<<<< HEAD
	/**
	 * @param subscriptionId the subscriptionId to set
	 */
=======
>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

<<<<<<< HEAD
	

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	
	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
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
=======
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

>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	public String getExternalId() {
		return externalId;
	}

<<<<<<< HEAD
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
=======
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	

>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	public Subscription getSubscription() {
		return subscription;
	}

<<<<<<< HEAD
	/**
	 * @param subscription the subscription to set
	 */
=======
>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Period [periodId=" + periodId + ", subscriptionId=" + subscriptionId + ", from=" + fromDate + ", until="
				+ toDate + ", createdTimeStamp=" + createdTimeStamp + ", externalId=" + externalId + ", customMessage="
				+ customMessage + ", subscription=" + subscription + "]";
	}

	
	
=======
		return "Period [periodId=" + periodId + ", subscriptionId=" + subscriptionId + ", from=" + from + ", until="
				+ until + ", createdTimestamp=" + createdTimestamp + ", externalId=" + externalId + "]";
	}
>>>>>>> 6e32553a7e42c43bafcb21ca5abb83a6d7de7123
	
}
