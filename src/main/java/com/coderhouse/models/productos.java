package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Productos {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

@Column(name = "titulo")
private String titulo;
}