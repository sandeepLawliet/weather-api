package com.ola.weather.services;

import java.util.Date;
import java.util.List;

import com.ola.weather.entity.Weather;

public interface WeatherServiceInterface {
	public List<Weather> getWeather();
	public Weather getWeatherById(long weatherId);
	public Weather addWeather(Weather weather);
	public List<Weather> getWeatherByCity(String city);
	public List<Weather> getWeatherByDate(String date);
	public List<Weather> sortWeatherByDate(String date);
}
