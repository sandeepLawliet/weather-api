package com.ola.weather.model;

import com.ola.weather.entity.Weather;

import java.io.Serializable;
import java.util.List;

public class ListResponse implements Serializable {

  private String error;
  private int statusCode;
  private boolean success;
  private List<Weather> weatherList;

  public ListResponse(int statusCode, List<Weather> weatherList, boolean success) {
    this.statusCode = statusCode;
    this.weatherList = weatherList;
    this.success = success;
  }

  public ListResponse(String error, int statusCode, boolean success) {
    this.error = error;
    this.statusCode = statusCode;
    this.success = success;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public List<Weather> getWeatherList() {
    return weatherList;
  }

  public void setWeatherList(List<Weather> weatherList) {
    this.weatherList = weatherList;
  }
}
