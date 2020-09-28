package com.ola.weather;


import com.ola.weather.exceptions.ListException;
import com.ola.weather.exceptions.SingleException;
import com.ola.weather.model.ListResponse;
import com.ola.weather.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@RequestMapping
public class ExceptionHandler {

  @ResponseBody
  @org.springframework.web.bind.annotation.ExceptionHandler(SingleException.class)
  public Response handleValidationException(SingleException e) {
    return new Response(e.getMessage(), HttpStatus.OK.value(), false);
  }

  @ResponseBody
  @org.springframework.web.bind.annotation.ExceptionHandler(ListException.class)
  public ListResponse handleValidationException(ListException e) {
    return new ListResponse(e.getMessage(), HttpStatus.OK.value(), false);
  }

}