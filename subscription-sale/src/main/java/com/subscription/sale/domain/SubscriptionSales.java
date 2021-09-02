package com.subscription.sale.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "subscription_sales")
public class SubscriptionSales {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "sale_id")
		private Integer saleId;
		
		@Column(name = "subscription_id")
		private Integer subscriptionId;
		
		@Column(name = "subscriber_id")
		private String subsriberId;
		
		@Column(name = "subscription_type")
		private String subscriptionType;
		
		@Column(name = "createdtimestamp")
		@Temporal(TemporalType.DATE)
		private Date createdTimeStamp;

		public Integer getSaleId() {
			return saleId;
		}

		public void setSaleId(Integer saleId) {
			this.saleId = saleId;
		}

		public Integer getSubscriptionId() {
			return subscriptionId;
		}

		public void setSubscriptionId(Integer subscriptionId) {
			this.subscriptionId = subscriptionId;
		}

		public String getSubsriberId() {
			return subsriberId;
		}

		public void setSubsriberId(String subsriberId) {
			this.subsriberId = subsriberId;
		}

		public String getSubscriptionType() {
			return subscriptionType;
		}

		public void setSubscriptionType(String subscriptionType) {
			this.subscriptionType = subscriptionType;
		}

		public Date getCreatedTimeStamp() {
			return createdTimeStamp;
		}

		public void setCreatedTimeStamp(Date createdTimeStamp) {
			this.createdTimeStamp = createdTimeStamp;
		}

		@Override
		public String toString() {
			return "SubscriptionSales [saleId=" + saleId + ", subscriptionId=" + subscriptionId + ", subsriberId="
					+ subsriberId + ", subscriptionType=" + subscriptionType + ", createdTimeStamp=" + createdTimeStamp
					+ "]";
		}
		
}
