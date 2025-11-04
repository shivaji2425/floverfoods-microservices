package com.microservices.entity;

import java.util.List;

import com.microservices.dto.ItemRequestDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurant" )
@Builder
public class Restaurant {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long restaurantId;
    
	@Size(min = 3, message = "Building name must be atleast 5 characters")
	private String restaurantName;
	@Size(min = 10, max = 10, message = "Phone number should be at")
	private String number;
	
	private double rating;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurant_id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurant_id")
	private List<Item> items;
    
	
	
	
	
	
	
}
