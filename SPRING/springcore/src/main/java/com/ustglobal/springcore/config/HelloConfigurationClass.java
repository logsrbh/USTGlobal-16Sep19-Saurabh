package com.ustglobal.springcore.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	
	@Bean(name = "hello")
	//@Scope("prototype") for prototype scope destroy method will not work bacause it not storing in spring container 
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I love Python");
		return hello;
		
	}
	
	
	


}
