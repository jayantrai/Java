package com.jayant.demoMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Tire {

	private String brand;

	
	// constructor
//	public Tire(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "It's working";
	}
	
	
	
}
