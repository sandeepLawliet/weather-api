package com.ola.weather.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ola.weather.entity.Weather;
import com.ola.weather.services.WeatherServiceInterface;

@RestController
public class WeatherController {

	@Autowired
	WeatherServiceInterface weatherService;
	//Get All the weather data
	@GetMapping("/weather")
	public List<Weather> getWeather() {
		
		return this.weatherService.getWeather();
		
	}
	
	@GetMapping("/weather/{weatherId}")
	public Weather getWeatherById(@PathVariable String weatherId) {
		return this.weatherService.getWeatherById(Long.parseLong(weatherId));
	}
	
	@GetMapping("/weather/city/{city}")
	public List<Weather> getWeatherByCity(@PathVariable String city) {
		return this.weatherService.getWeatherByCity(city);
	}
	
	@GetMapping("/weather/date/{date}")
	public List<Weather> getWeatherByDate(@PathVariable String date) {
		return this.weatherService.getWeatherByDate(date);
	}
	
	@GetMapping("/weather/sort/{date}")
	public List<Weather> sortWeatherByDate(@PathVariable String date) {
		return this.weatherService.sortWeatherByDate(date);
	}
	
	@PostMapping(path = "/weather", consumes = "application/json")
	public Weather addWeather(@RequestBody Weather weather) {
		return this.weatherService.addWeather(weather);
	}
	
}
