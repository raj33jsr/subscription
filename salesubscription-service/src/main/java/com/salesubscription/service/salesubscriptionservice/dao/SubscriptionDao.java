/**
 * 
 */
package com.salesubscription.service.salesubscriptionservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesubscription.service.salesubscriptionservice.domain.Subscription;

/**
 * @author mahanraj
 *
 */
@Repository
public interface SubscriptionDao extends JpaRepository<Subscription,Integer> {

}
