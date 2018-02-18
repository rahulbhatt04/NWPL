package com.cashflow.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cashflow.service.ListingService;
@Configuration
public class ServiceConfig {

	@Bean 
	public ListingService listingService() {
		return new ListingService();
	}
}
