package com.vcube.hellospringapp05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	
	@Bean(name="car")
	Car getCar() {
		return new Car(getEngine());
		
	}
	
	Engine getEngine() {
		return new Engine();
		
	}
	
	
	

}
