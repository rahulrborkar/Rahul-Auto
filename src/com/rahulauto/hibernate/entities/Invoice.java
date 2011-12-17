package com.rahulauto.hibernate.entities;

public class Invoice {
	
	private String invoiceId;
	private String dateCreated;	
	private Customer customer;
	private Double tax1;
	private Double tax2;
	private InvoiceDetail invoiceDetail;
	
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public InvoiceDetail getInvoiceDetail() {
		return invoiceDetail;
	}
	public void setInvoiceDetail(InvoiceDetail invoiceDetail) {
		this.invoiceDetail = invoiceDetail;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", dateCreated="
				+ dateCreated + ", customer=" + customer + ", invoiceDetail="
				+ invoiceDetail + "]";
	}
	
	
}
