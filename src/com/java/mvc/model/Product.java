package com.java.mvc.model;

public class Product {
	private int id;
	private String productName;
	private double price;
	
	public Product(int id, String productName) {
		this.id = id;
		this.productName = productName;
	}

	public int getId() {
		return id;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}
}
