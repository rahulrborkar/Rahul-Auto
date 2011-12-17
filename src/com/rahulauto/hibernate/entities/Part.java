package com.rahulauto.hibernate.entities;

public class Part {
	private String id;
	private String companyPartName;
	private String localPartName;
	private String vehicleType;
	private String bodyType;
	private Double companyPrice;
	private Double localPrice;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyPartName() {
		return companyPartName;
	}
	public void setCompanyPartName(String companyPartName) {
		this.companyPartName = companyPartName;
	}
	public String getLocalPartName() {
		return localPartName;
	}
	public void setLocalPartName(String localPartName) {
		this.localPartName = localPartName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public Double getCompanyPrice() {
		return companyPrice;
	}
	public void setCompanyPrice(Double companyPrice) {
		this.companyPrice = companyPrice;
	}
	public Double getLocalPrice() {
		return localPrice;
	}
	public void setLocalPrice(Double localPrice) {
		this.localPrice = localPrice;
	}
	@Override
	public String toString() {
		return "Part [id=" + id + ", companyPartName=" + companyPartName
				+ ", localPartName=" + localPartName + ", vehicleType="
				+ vehicleType + ", bodyType=" + bodyType + ", companyPrice="
				+ companyPrice + ", localPrice=" + localPrice + "]";
	}
	
}
