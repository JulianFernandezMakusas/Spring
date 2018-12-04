package com.utn.clase1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.utn.clase1.interfaces.IArma;


@Component
public class Jugador {
	@Value("defaultname")
	private String nombre;
	@Autowired
	private Energia energia;
	@Autowired
	@Qualifier("armaInicial")
	IArma arma;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Energia getEnergia() {
		return energia;
	}
	public void setEnergia(Energia energia) {
		this.energia = energia;
	}
	public IArma getArma() {
		return arma;
	}
	public void setArma(IArma arma) {
		this.arma = arma;
	}
	
}
