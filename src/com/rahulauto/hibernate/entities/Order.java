package com.rahulauto.hibernate.entities;

public class Order {
	private String orderId;
	private String orderType;
	private String orderDate;
	private Double amount;
	private Double totalAmount;
	private Double tax1;
	private Double tax2;
	private String customerId;
	private String vehicleId;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getTax1() {
		return tax1;
	}
	public void setTax1(Double tax1) {
		this.tax1 = tax1;
	}
	public Double getTax2() {
		return tax2;
	}
	public void setTax2(Double tax2) {
		this.tax2 = tax2;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderType=" + orderType
				+ ", orderDate=" + orderDate + ", amount=" + amount
				+ ", totalAmount=" + totalAmount + ", tax1=" + tax1 + ", tax2="
				+ tax2 + ", customerId=" + customerId + ", vehicleId="
				+ vehicleId + "]";
	}
	
	
}
