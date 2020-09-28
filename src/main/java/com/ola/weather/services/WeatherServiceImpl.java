package com.ola.weather.services;

import java.util.Date;
import java.util.List;

import com.ola.weather.exceptions.ListException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ola.weather.dao.WeatherDAO;
import com.ola.weather.entity.Weather;

@Service
public class WeatherServiceImpl implements WeatherServiceInterface{

	private WeatherDAO weatherDAO;

	@Autowired
	public WeatherServiceImpl( WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}

	@Override
	public List<Weather> getWeather() {
		try {
			return this.weatherDAO.findAll();
		} catch (Exception e) {
			throw new ListException("Failed to get All weathers due to " + e.getStackTrace());
		}
	}

	@Override
	public Weather getWeatherById(long weatherId) {
		
		return this.weatherDAO.getOne(weatherId);
	}

	@Override
	public Weather addWeather(Weather weather) {
		this.weatherDAO.save(weather); 
		return weather;
	}

	@Override
	public List<Weather> getWeatherByCity(String city) {
		
		
		return this.weatherDAO.getWeatherByCity(city);
	}

	@Override
	public List<Weather> getWeatherByDate(String date) {
		Date dateObject = new Date(date);
		return this.weatherDAO.getAllByDate(dateObject);
	}

	@Override
	public List<Weather> sortWeatherByDate(String date) {
		if(date.equals("date")){
			return this.weatherDAO.sortWeatherByDateAsc();
		}else if(date.equals("-date")) {
			return this.weatherDAO.sortWeatherByDateDesc();
		}
		return null;
	}

}
