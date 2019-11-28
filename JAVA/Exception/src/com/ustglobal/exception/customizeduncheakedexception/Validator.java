package com.ustglobal.exception.customizeduncheakedexception;

public class Validator {
	
	void verify(int age) {
		if(age <18) {
			throw new InvalidAgeException("Try Again Next Year");
		}
	}

}
