package com.cashflow.pls.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cashflow.service.ListingService;
import com.pls.model.PropertyInfo;

@RestController
public class ListingController {

	@Inject
	private ListingService listingService;
	
	@GetMapping("/listing/{id}")
	public PropertyInfo getListing(@PathVariable String id) {
		return listingService.getPropertyInfoById(id);
		
	}
}
