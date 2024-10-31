package com.coderhouse.models;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Clients")

public class Client {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	private String lastname;
	private boolean status;
	private LocalDateTime createdAt =LocalDateTime.now();
	
	@Column(unique = true, nullable = false)
	private String docNumber;
	@Column(unique = true, nullable = false)
	private String email;
	
	private List<Sale> sales = ArrayList<>();
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getDocNumber() {
		return docNumber;
	}


	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Sale getSales() {
		return sales;
	}


	public void setSales(Sale sales) {
		this.sales = sales;
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Sales_id", referencedColumnName = "id" )
	
	private Sale sales;


	@Override
	public String toString() {
		return "Clients [id=" + id + ", name=" + name + ", email=" + email + ", lastname=" + lastname + ", docNumber="
				+ docNumber + ", status=" + status + ", sales=" + sales + "]";
	}
	

}
