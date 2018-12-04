package com.utn.clase1.beans;

import org.springframework.stereotype.Component;

import com.utn.clase1.interfaces.IArma;
@Component
public class Espada implements IArma {

	public String atacar() {
		
		return "Derrotaste al ñoblin sin morir como tu compañero, felicidades.";
	}

}
