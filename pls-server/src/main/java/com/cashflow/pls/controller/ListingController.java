package com.cashflow.pls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pls.model.PropertyInfo;

@RestController
public class ListingController {

	@GetMapping("/listing")
	public PropertyInfo getListing() {
		PropertyInfo propInfo = null;
		return propInfo;
		
	}
}
