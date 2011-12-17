package com.rahulauto.hibernate.entities;

public class InvoiceDetail {
	
	private String detailId;
	private Part part;
	private Service service;
	private Double overridenRate;
	private Double quantity;
	private boolean isService;
	private boolean isPart;
	
	public boolean isPart() {
		return isPart;
	}
	public boolean isService() {
		return isService;
	}
	public void setIsPart(boolean isPart) {
		this.isPart = isPart;
	}
	public void setIsService(boolean isService) {
		this.isService = isService;
	}
	public String getDetailId() {
		return detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Double getOverridenRate() {
		return overridenRate;
	}
	public void setOverridenRate(Double overridenRate) {
		this.overridenRate = overridenRate;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "InvoiceDetail [detailId=" + detailId + ", part=" + part
				+ ", service=" + service + ", overridenRate=" + overridenRate
				+ ", quantity=" + quantity + "]";
	}
	
	
}
