package com.utn.ejemploMaven.bean;

public class Persona {
	
	private int id;
	private int dni;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int edad) {
		this.dni = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int id, int dni, String nombre) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
	}

}
