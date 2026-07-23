package com.vcube.hellospringapp06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car {
	@Autowired
	private Engine engine;

	
	
	void drive() {
		System.out.println("drive method called ");
		engine.start();
	}

}
