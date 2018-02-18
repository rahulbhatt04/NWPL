package com.cashflow.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashflow.db.ListingDao;
import com.cashflow.db.repo.ListingRepo;
import com.pls.model.PropertyInfo;

@Service
@Transactional
public class ListingService {

	@Autowired
	private ListingRepo listingRepo;
	
	public PropertyInfo getPropertyInfoById() {
		
		ListingDao dbObject = listingRepo.findOne("Test");
		PropertyInfo propertyInfo =new PropertyInfo();
		propertyInfo.setDateListed(dbObject.getCreatedDate());
		return propertyInfo;
	}
	
}
