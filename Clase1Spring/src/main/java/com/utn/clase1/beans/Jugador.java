package com.utn.clase1.beans;

public class Jugador {
	private String nombre;
	private Arma arma;
	private Energia energia;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Energia getEnergia() {
		return energia;
	}
	public void setEnergia(Energia energia) {
		this.energia = energia;
	}
	
}
