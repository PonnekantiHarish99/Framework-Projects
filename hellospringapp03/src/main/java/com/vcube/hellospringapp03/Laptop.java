package com.vcube.hellospringapp03;

public class Laptop {
	
	 String model;
	 String brand;
	 double price;
	
	public Laptop() {
		System.out.println("no arg laptop  constructor called ");
	}
	
	

	public Laptop(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	void show() {
		  System.out.println("brand : "+getBrand());
	      System.out.println("model :" + getModel());
	      System.out.println("price :" + getPrice());
	}
	
	

}
