/**
 * 
 */
package com.subscription.sale.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author mahanraj
 *
 */
public class Subscription {
	
	private Integer subscriptionid;
	
	
	private String subsriberId;
	
	private String nsCode;
	
	
	private String externalId;
	
	private String type;
	
	private String customMessage;
	
	private Boolean active;
	
	private Date createdTimeStamp;
	
	private Date latsModifiedTime;
	
	private Date terminated;
	
	private List<Period> periods ;

	public Integer getSubscriptionid() {
		return subscriptionid;
	}

	public void setSubscriptionid(Integer subscriptionid) {
		this.subscriptionid = subscriptionid;
	}

	public String getSubsriberId() {
		return subsriberId;
	}

	public void setSubsriberId(String subsriberId) {
		this.subsriberId = subsriberId;
	}

	public String getNsCode() {
		return nsCode;
	}

	public void setNsCode(String nsCode) {
		this.nsCode = nsCode;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCustomMessage() {
		return customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public Date getLatsModifiedTime() {
		return latsModifiedTime;
	}

	public void setLatsModifiedTime(Date latsModifiedTime) {
		this.latsModifiedTime = latsModifiedTime;
	}

	public Date getTerminated() {
		return terminated;
	}

	public void setTerminated(Date terminated) {
		this.terminated = terminated;
	}
	
	

	/**
	 * @return the periods
	 */
	//@JsonIgnore
	public List<Period> getPeriods() {
		return periods;
	}

	/**
	 * @param periods the periods to set
	 */
	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	@Override
	public String toString() {
		return "Subscription [subscriptionid=" + subscriptionid + ", subsriberId=" + subsriberId + ", nsCode=" + nsCode
				+ ", externalId=" + externalId + ", type=" + type + ", customMessage=" + customMessage + ", active="
				+ active + ", createdTimeStamp=" + createdTimeStamp + ", latsModifiedTime=" + latsModifiedTime
				+ ", terminated=" + terminated + ", periods=" + periods + "]";
	}

	



}
