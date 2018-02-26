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
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateTimeConverter;

@Entity(name = "listing")

public class Listing {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name="ID", unique=true)
	private String id;

	@Column(name="CREATED_D")
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime createdDate;
	
	@Column(name="description")
	private String description;
	
	
    @OneToOne(mappedBy="listing",
    		fetch = FetchType.LAZY,
            cascade =  {CascadeType.ALL}
    		)
    @JoinColumn(name = "ADDRESS_ID")  // you can rename the join column 

	private Address address;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	

}
