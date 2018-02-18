package com.cashflow.pls.controller;

import org.pls.model.PropertyInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListingController {

	@GetMapping("/listing")
	public PropertyInfo getListing() {
		PropertyInfo propInfo = null;
		return propInfo;
		
	}
}
