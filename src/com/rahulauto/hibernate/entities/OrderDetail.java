package com.rahulauto.hibernate.entities;

public class OrderDetail {
	private String id;
	private String OrderId;
	private String detailName;
	private Double price;
	private int numbers;
	private Double totalPrice;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getDetailName() {
		return detailName;
	}	
	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", OrderId=" + OrderId
				+ ", detailName=" + detailName + ", price=" + price
				+ ", numbers=" + numbers + ", totalPrice=" + totalPrice + "]";
	}
	
	
}
