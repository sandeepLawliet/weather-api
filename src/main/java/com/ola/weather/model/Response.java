package com.ola.weather.model;

import com.ola.weather.entity.Weather;

import java.io.Serializable;

public class Response implements Serializable {

    private String error;
    private int statusCode;
    private boolean success;
    private Weather weather;

  public Response(int statusCode, Weather weather, boolean success) {
    this.statusCode = statusCode;
    this.weather = weather;
    this.success  = success;
  }

  public Response(String error, int statusCode, boolean success) {
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

  public Weather getWeather() {
    return weather;
  }

  public void setWeather(Weather weather) {
    this.weather = weather;
  }
}
