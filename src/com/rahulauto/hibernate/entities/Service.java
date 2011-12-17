package com.rahulauto.hibernate.entities;

public class Service {
	private String id;
	private String name;
	private String description;
	private Double rate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Service [id=" + id + ", name=" + name + ", description="
				+ description + ", rate=" + rate + "]";
	}
	
	
}
