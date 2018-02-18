package com.cashflow.service;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cashflow.db.ListingDao;
import com.cashflow.db.repo.ListingRepo;
import com.pls.model.PropertyInfo;

@Service
@Transactional
public class ListingService {

	@Inject
	private ListingRepo listingRepo;
	
	public PropertyInfo getPropertyInfoById(String id) {
		
		ListingDao dbObject = listingRepo.findOne(id);
		PropertyInfo propertyInfo =new PropertyInfo();
		propertyInfo.setDateListed(dbObject.getCreatedDate());
		return propertyInfo;
	}
	
}
