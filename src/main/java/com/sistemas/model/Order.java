package com.sistemas.model;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Order {
	
	private Long id;
	
	private String numero;
	
	private Date fechaCreacion;
	
	private Data fechaRecibida;
	
	private double total;
	
	@Override
	public String toString() {
		return "Order[id = "+id+", numero = "+numero+", fechaCreacion = "+fechaRecibida+",total = "+total+" ]";
	}
}
