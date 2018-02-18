package org.pls.model;

import java.math.BigDecimal;
import java.util.Date;

import org.pls.model.enums.ValuationSource;
import org.pls.model.enums.ValuationType;

public class ValuationInfo {

	private BigDecimal valuationAmount;
	
	private ValuationType valuationType;
	
	private ValuationSource valuationSource;
	
	private Date createdDate;
	
}
