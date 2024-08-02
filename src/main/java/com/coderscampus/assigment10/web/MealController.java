package com.coderscampus.assigment10.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assigment10.dto.DayResponse;
import com.coderscampus.assigment10.dto.WeekResponse;

@RestController
public class MealController {
	
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		RestTemplate rt = new RestTemplate();
		
		if(numCalories == null && diet == null && exclusions == null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
					.build()
					.toUri();
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories != null && diet == null && exclusions == null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
					.queryParam("targetCalories", numCalories)
					.build()
					.toUri();
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories != null && diet != null && exclusions == null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
					.queryParam("targetCalories", numCalories)
					.queryParam("diet", diet)
					.build()
					.toUri();
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories != null && diet == null && exclusions != null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
					.queryParam("targetCalories", numCalories)
					.queryParam("exclude", exclusions)
					.build()
					.toUri();
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories == null && diet != null && exclusions == null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
					.queryParam("diet", diet)
					.build()
					.toUri();
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories == null && diet != null && exclusions != null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
					.queryParam("diet", diet)
					.queryParam("exclude", exclusions)
					.build()
					.toUri();
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories == null && diet == null && exclusions != null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
					.queryParam("exclude", exclusions)
					.build()
					.toUri();
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			System.out.println(uri);
			return response;
		}
		
			

			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
					.queryParam("targetCalories", numCalories)
					.queryParam("diet", diet)
					.queryParam("exclude", exclusions)
					.build()
					.toUri();
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			System.out.println(uri);
			return response;
		
	}
	
	

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
RestTemplate rt = new RestTemplate();
		
		if(numCalories == null && diet == null && exclusions == null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
					.build()
					.toUri();
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories != null && diet == null && exclusions == null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
					.queryParam("targetCalories", numCalories)
					.build()
					.toUri();
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories != null && diet != null && exclusions == null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
					.queryParam("targetCalories", numCalories)
					.queryParam("diet", diet)
					.build()
					.toUri();
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories != null && diet == null && exclusions != null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
					.queryParam("targetCalories", numCalories)
					.queryParam("exclude", exclusions)
					.build()
					.toUri();
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories == null && diet != null && exclusions == null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
					.queryParam("diet", diet)
					.build()
					.toUri();
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories == null && diet != null && exclusions != null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
					.queryParam("diet", diet)
					.queryParam("exclude", exclusions)
					.build()
					.toUri();
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			System.out.println(uri);
			return response;
		}
		if(numCalories == null && diet == null && exclusions != null) {
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
					.queryParam("exclude", exclusions)
					.build()
					.toUri();
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			System.out.println(uri);
			return response;
		}
		
			

			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
					.queryParam("targetCalories", numCalories)
					.queryParam("diet", diet)
					.queryParam("exclude", exclusions)
					.build()
					.toUri();
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			System.out.println(uri);
			return response;
		
	}
}
