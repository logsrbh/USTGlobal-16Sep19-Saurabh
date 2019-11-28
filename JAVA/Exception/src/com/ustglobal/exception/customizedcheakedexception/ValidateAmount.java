package com.ustglobal.exception.customizedcheakedexception;

public class ValidateAmount{
	
	void cheakAmount(int amount) throws InvalidAmountException {
		if(amount >40000) {
			throw new InvalidAmountException(); 
		}
	}

}
