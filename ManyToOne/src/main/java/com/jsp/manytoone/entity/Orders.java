package com.jsp.manytoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Orders {

	
	@Id
    private int id;
    private String product;
    private double amount;
    
    
    @ManyToOne
    private Customer customer;
    
    public Orders() {
	}

	public Orders(int id, String product, double amount, Customer customer) {
		super();
		this.id = id;
		this.product = product;
		this.amount = amount;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
    
    
}
