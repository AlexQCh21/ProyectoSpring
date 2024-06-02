package com.sistemas.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class DetalleOrden {
	private Long id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
	
	
	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	
	
}
