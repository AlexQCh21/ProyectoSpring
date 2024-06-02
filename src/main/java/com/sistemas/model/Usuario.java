package com.sistemas.model;

import jakarta.persistence.Entity;

@Entity()
public class Usuario {
	
	private Long id;
	
	private String nombre;
	
	private String username;
	
	private String email;
	
	private String apellido;
	
	private String direccion;
	
	private String telefono;
	
	private String tipo;
	
	private String clave;
	
	
}
