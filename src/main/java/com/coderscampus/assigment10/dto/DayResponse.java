package com.coderscampus.assigment10.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {
	@JsonProperty("meals")
	ArrayList<Meal> mealList = new ArrayList<Meal>(3);
	
	@JsonProperty("nutrients")
	Nutrients nutrients;
}
