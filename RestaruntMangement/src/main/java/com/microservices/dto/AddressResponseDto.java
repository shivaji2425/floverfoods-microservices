package com.microservices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDto {
    
	private String message = "Address added";
	private long addressId;
	private String doorNo;
	private String landmark;
	private String city;
	private String pincode;
}


