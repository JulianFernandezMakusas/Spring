package com.utn.clase1.beans;

import org.springframework.stereotype.Component;

import com.utn.clase1.interfaces.IArma;
@Component("armaInicial")
public class Cuchillo implements IArma {

	public String atacar() {
		return "Atacaste con el cuchillo, lo mataste, pero te mato un ñoblin y vas a estar inconciente 3 horas, PETE";
	}

}
