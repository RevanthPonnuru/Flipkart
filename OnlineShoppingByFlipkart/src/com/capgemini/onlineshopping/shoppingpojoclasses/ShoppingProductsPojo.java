package com.capgemini.onlineshopping.shoppingpojoclasses;

public class ShoppingProductsPojo {

	

	
	private String ProductId;
	private String ProductName;
	private String ProductDescription;
	private String ProductSpecifications;
	public ShoppingProductsPojo(String productId, String productName, String productDescription, String productSpecifications) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductDescription = productDescription;
		ProductSpecifications = productSpecifications;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}
	public String getProductSpecifications() {
		return ProductSpecifications;
	}
	public void setProductSpecifications(String productSpecifications) {
		ProductSpecifications = productSpecifications;
	}
	@Override
	public String toString() {
		return "ShoppingProductsPojo [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductDescription="
				+ ProductDescription + ", ProductSpecifications=" + ProductSpecifications + "]";
	}

	}


