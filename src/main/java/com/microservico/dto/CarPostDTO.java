package com.microservico.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude
@Builder
public class CarPostDTO {

	private String model;
	private String brand;
	private String price;
	private String description;
	private String engineVersion;
	private String city;
	private String createdDate;
	private Long ownerId;
	private String counterName;
	private String counterType;
	private String contact;
	
}
