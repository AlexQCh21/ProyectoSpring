package com.sistemas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "producto")
public class Producto {

	private Long id;
	
	private String nombre;
	
	private String image;
	
	private int cantidad;
	
	private double precio;
	
	
}
