package com.vcube.hellospringapp05;

public class Car {
	
	private Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	
	void drive() {
		System.out.println("drive method called ");
		
		engine.start();
	}

}
