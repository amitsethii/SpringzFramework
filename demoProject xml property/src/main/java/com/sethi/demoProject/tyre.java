package com.sethi.demoProject;

public class tyre {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public tyre(String brand) {
		super();
		this.brand = brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "tyre [brand=" + brand + "]";
	}
	
	

}
