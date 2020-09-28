package com.ola.weather.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Weather {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date date;
	private double lat;
	private double lon;
	private String city;
	private String state;
	
	@ElementCollection
	List<Double> temperatures;
	
	public Weather(Date date, double lat, double lon, String city, String state, List<Double> temperatures) {
		super();
		this.date = date;
		this.lat = lat;
		this.lon = lon;
		this.city = city;
		this.state = state;
		this.temperatures = temperatures;
	}

	public Weather() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Double> getTemperatures() {
		return temperatures;
	}

	public void setTemperatures(List<Double> temperatures) {
		this.temperatures = temperatures;
	}

	
	
}
