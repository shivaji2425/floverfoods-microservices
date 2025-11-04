package com.microservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	private String doorNo;
	private String landmark;
	private String city;
	private String pincode;
	
	public Address(String doorNo, String landmark, String city, String pincode) {
		super();
		this.doorNo = doorNo;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	
	
}
