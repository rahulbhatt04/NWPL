package org.pls.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.pls.model.enums.PropertyType;

public class PropertyInfo {
	private String name;
	private AddressInfo addressInfo;
	private PropertyType propertyType;
	private int bed;
	private int fullBath;
	private int halfBath;
	private int yearBuilt;
	private Date dateListed;
	private String description;
	private String photosLink;
	private BigDecimal askingPrice;
	private BigDecimal askingPriceAfterCommision;
	private BigDecimal platformFees;
	private List<ValuationInfo> valuationsInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressInfo getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}
	public PropertyType getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}
	public int getBed() {
		return bed;
	}
	public void setBed(int bed) {
		this.bed = bed;
	}
	public int getFullBath() {
		return fullBath;
	}
	public void setFullBath(int fullBath) {
		this.fullBath = fullBath;
	}
	public int getHalfBath() {
		return halfBath;
	}
	public void setHalfBath(int halfBath) {
		this.halfBath = halfBath;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public Date getDateListed() {
		return dateListed;
	}
	public void setDateListed(Date dateListed) {
		this.dateListed = dateListed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhotosLink() {
		return photosLink;
	}
	public void setPhotosLink(String photosLink) {
		this.photosLink = photosLink;
	}
	public BigDecimal getAskingPrice() {
		return askingPrice;
	}
	public void setAskingPrice(BigDecimal askingPrice) {
		this.askingPrice = askingPrice;
	}
	public BigDecimal getAskingPriceAfterCommision() {
		return askingPriceAfterCommision;
	}
	public void setAskingPriceAfterCommision(BigDecimal askingPriceAfterCommision) {
		this.askingPriceAfterCommision = askingPriceAfterCommision;
	}
	public BigDecimal getPlatformFees() {
		return platformFees;
	}
	public void setPlatformFees(BigDecimal platformFees) {
		this.platformFees = platformFees;
	}
	public List<ValuationInfo> getValuationsInfo() {
		return valuationsInfo;
	}
	public void setValuationsInfo(List<ValuationInfo> valuationsInfo) {
		this.valuationsInfo = valuationsInfo;
	}
	
	

}
