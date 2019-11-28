package com.ustglobal.exception.customizeduncheakedexception;

public class InvalidAgeException extends RuntimeException {
	private String message ="Invalid age below 18 years Not Allowed";
	
	
	
	
	public InvalidAgeException() {
	
	}
	
	public InvalidAgeException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	

}
