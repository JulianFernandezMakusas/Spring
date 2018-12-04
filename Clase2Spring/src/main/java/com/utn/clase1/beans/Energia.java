package com.utn.clase1.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Energia {
	@Value("100")
	private int cantidad;
	@Value("100")
	private int maxCant;
	@Value("false")
	private boolean poder;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getMaxCant() {
		return maxCant;
	}

	public void setMaxCant(int maxCant) {
		this.maxCant = maxCant;
	}

	public boolean isPoder() {
		return poder;
	}

	public void setPoder(boolean poder) {
		this.poder = poder;
	}

}
