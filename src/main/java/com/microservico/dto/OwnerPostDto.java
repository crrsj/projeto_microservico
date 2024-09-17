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
public class OwnerPostDTO {

	private String name;
	private String type;
	private String contactNumber;
}
