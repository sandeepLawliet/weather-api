package com.ola.weather.services;

import com.ola.weather.entity.Weather;

import java.util.List;

public interface WeatherServiceInterface {
	List<Weather> getWeather();
	Weather getWeatherById(long weatherId);
	Weather addWeather(Weather weather);
	List<Weather> getWeatherByCity(String city);
	List<Weather> getWeatherByDate(String date);
	List<Weather> sortWeatherByDate(String date);
}
