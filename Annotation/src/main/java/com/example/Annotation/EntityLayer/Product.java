package com.example.Annotation.EntityLayer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long productId;
private String Name;
private double price;


@ManyToOne
private Customer customer;


public Product(){}


public Product(Long productId, String name, double price) {
	super();
	this.productId = productId;
	Name = name;
	this.price = price;
}


public Long getProductId() {
	return productId;
}


public void setProductId(Long productId) {
	this.productId = productId;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


}


