package com.salesubscription.service.salesubscriptionservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesubscription.service.salesubscriptionservice.dao.PeriodDao;
import com.salesubscription.service.salesubscriptionservice.domain.Period;

@Service
public class PeriodImpl {
	
	@Autowired
	private PeriodDao periodDao;
	
	public Period getPeriod(Integer periodId) {
		Optional<Period> period =  periodDao.findById(periodId);
		return period.get();
	}
	
	public Period savePeriod(Period period) {
		return periodDao.save(period);
	}
	
}
