package com.pls.model;

import java.math.BigDecimal;
import java.util.Date;

import com.pls.model.enums.ValuationSource;
import com.pls.model.enums.ValuationType;

public class ValuationInfo {

	private BigDecimal valuationAmount;
	
	private ValuationType valuationType;
	
	private ValuationSource valuationSource;
	
	private Date createdDate;
	
}
