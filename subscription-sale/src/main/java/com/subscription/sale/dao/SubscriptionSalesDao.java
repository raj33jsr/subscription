package com.subscription.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subscription.sale.domain.SubscriptionSales;



@Repository
public interface SubscriptionSalesDao extends JpaRepository<SubscriptionSales, Integer>{


}
