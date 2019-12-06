package com.ustglobal.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springboot.dto.EmployeeResponse;

/*
@Controller + @ ResponseBody = @RestController
@ControllerAdvice + @ResponseBody = @RestControllerAdvice

 */
@RestControllerAdvice
public class HandleException {

	
	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
		return response;
	}
	
	

}
