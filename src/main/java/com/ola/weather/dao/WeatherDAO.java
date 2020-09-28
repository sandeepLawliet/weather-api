package com.ola.weather.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ola.weather.entity.Weather;

public interface WeatherDAO extends JpaRepository<Weather, Long> {
	
	 @Query("SELECT w FROM Weather w WHERE " +
	            "LOWER(w.city) LIKE LOWER(CONCAT('%',:city, '%'))")
	 public List<Weather> getWeatherByCity(String city);

	 List<Weather> getAllByDate(Date date);

	 @Query("SELECT w FROM Weather w order by w.date asc ")
	public List<Weather> sortWeatherByDateAsc();
	 
	 @Query("SELECT w FROM Weather w order by w.date desc")
	 public List<Weather> sortWeatherByDateDesc();
}
