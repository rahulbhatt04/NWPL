package com.pocketlisting.data;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateTimeConverter;

@Entity(name = "address")

public class Address {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "ID", unique = true)
	private String id;

	@Column(name = "street_no")
	private String streetNo;
	@Column(name = "CREATED_D")
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime createdDate;
	@Column(name = "street_name")
	private String streetName;
	@Column(name = "CITY")
	private String city;

	@Column(name = "ZIP")
	private String zip;
	@Column(name = "STATE_CODE")
	private String state;
	
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Listing listing;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Listing getListing() {
		return listing;
	}
	public void setListing(Listing listing) {
		this.listing = listing;
	}
	
	

}
