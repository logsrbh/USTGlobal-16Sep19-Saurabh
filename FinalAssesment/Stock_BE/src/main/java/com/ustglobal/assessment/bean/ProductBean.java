package com.ustglobal.assessment.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductBean {

@Column
@Id
@GeneratedValue
private int id;

@Column
private String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Column
private String company;

@Column
private String category;

@Column
private int quantity;

@Column
private double price;

}
