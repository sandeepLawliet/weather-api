package com.ola.weather.controller;

import com.ola.weather.entity.Weather;
import com.ola.weather.model.ListResponse;
import com.ola.weather.model.Response;
import com.ola.weather.services.WeatherServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

	@Autowired
	WeatherServiceInterface weatherService;
	//Get All the weather data
	@GetMapping("/weather")
	public ListResponse getWeather() {
		List<Weather> result  = weatherService.getWeather();
		return new ListResponse(HttpStatus.OK.value(), result, true);
	}
	
	@GetMapping("/weather/{weatherId}")
	public Response getWeatherById(@PathVariable String weatherId) {
		Weather result  = weatherService.getWeatherById(Long.valueOf(weatherId));
		return new Response(HttpStatus.OK.value(), result, true);
	}
	
	@GetMapping("/weather/city/{city}")
	public ListResponse getWeatherByCity(@PathVariable String city) {
		List<Weather> result  = weatherService.getWeatherByCity(city);
		return new ListResponse(HttpStatus.OK.value(), result, true);
	}

	@GetMapping("/weather/date/{date}")
	public ListResponse getWeatherByDate(@PathVariable String date) {
		List<Weather> result = weatherService.getWeatherByDate(date);
		return new ListResponse(HttpStatus.OK.value(), result, true);
	}
	
	@GetMapping("/weather/sort/{date}")
	public ListResponse sortWeatherByDate(@PathVariable String date) {
		List<Weather> result = weatherService.sortWeatherByDate(date);
		return new ListResponse(HttpStatus.OK.value(), result, true);
	}
	
	@PostMapping(path = "/weather", consumes = "application/json")
	public Response addWeather(@RequestBody Weather weather) {
		Weather result = weatherService.addWeather(weather);
		return new Response(HttpStatus.OK.value(), result, true);
	}
	
}
