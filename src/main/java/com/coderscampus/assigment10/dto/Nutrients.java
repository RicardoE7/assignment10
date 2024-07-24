package com.coderscampus.assigment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
	@JsonProperty("calories")
	private double calories;
	
	@JsonProperty("protein")
	private double protein;
	
	@JsonProperty("fat")
	private double fat;
	
	@JsonProperty("carbohydrates")
	private double carbohydrates;
}
