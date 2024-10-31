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
@Table(name="Sales")
public class Sale {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	private LocalDateTime createdAt =LocalDateTime.now();
	
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Client getClients() {
		return clients;
	}

	public void setClients(Client clients) {
		this.clients = clients;
	}

	
	@OneToOne(mappedBy = "Sales")
	private Client clients;

	@Override
	public String toString() {
		return "Sales [id=" + id + ", date=" +  ", name=" + name + ", createdAt=" + createdAt + ", updatedAt="
				+  ", clients=" + clients + "]";
	}
	
	
	
	
}
