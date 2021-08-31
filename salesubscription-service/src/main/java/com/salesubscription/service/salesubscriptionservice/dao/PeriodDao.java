package com.salesubscription.service.salesubscriptionservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesubscription.service.salesubscriptionservice.domain.Period;

@Repository
public interface PeriodDao extends JpaRepository<Period, Integer>{

}
