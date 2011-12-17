package com.rahulauto.hibernate.entities;

public class Vehicle {
	private String number;
	private String chassiNumber;
	private String model;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getChassiNumber() {
		return chassiNumber;
	}
	public void setChassiNumber(String chassiNumber) {
		this.chassiNumber = chassiNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [number=" + number + ", chassiNumber=" + chassiNumber
				+ ", model=" + model + "]";
	}	
		
	
	
	
}
