package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

@Column(name = "title")
private String title;
private String description;
private Long price;
private Integer stock;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "Products [id=" + id + ", title=" + title + ", description=" + description + "]";
}

public Integer getStock() {
	return stock;
}

public void setStock(Integer stock) {
	this.stock = stock;
}

public Long getPrice() {
	return price;
}

public void setPrice(Long price) {
	this.price = price;
}


}
