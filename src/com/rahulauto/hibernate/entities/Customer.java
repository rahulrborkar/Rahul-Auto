package com.rahulauto.hibernate.entities;

import java.util.Date;

public class Customer {
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String birthDate;
	private long contactNumber;
	private Date lastUpdateDate;
	private String vehicleNumber;
	private Date vehiclePurchaseDate;
	private Date lastServicingDate;
	private Date nextServicingDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public Date getVehiclePurchaseDate() {
		return vehiclePurchaseDate;
	}
	public void setVehiclePurchaseDate(Date vehiclePurchaseDate) {
		this.vehiclePurchaseDate = vehiclePurchaseDate;
	}
	public Date getLastServicingDate() {
		return lastServicingDate;
	}
	public void setLastServicingDate(Date lastServicingDate) {
		this.lastServicingDate = lastServicingDate;
	}
	public Date getNextServicingDate() {
		return nextServicingDate;
	}
	public void setNextServicingDate(Date nextServicingDate) {
		this.nextServicingDate = nextServicingDate;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", address=" + address + ", birthDate=" + birthDate
				+ ", contactNumber=" + contactNumber + ", lastUpdateDate="
				+ lastUpdateDate + ", vehicleNumber=" + vehicleNumber
				+ ", vehiclePurchaseDate=" + vehiclePurchaseDate
				+ ", lastServicingDate=" + lastServicingDate
				+ ", nextServicingDate=" + nextServicingDate + "]";
	}
	
	
}
