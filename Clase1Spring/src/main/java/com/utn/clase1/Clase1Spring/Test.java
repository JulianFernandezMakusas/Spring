package com.utn.clase1.Clase1Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.clase1.beans.HolaMundo;
import com.utn.clase1.beans.Jugador;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utn/xml/beans.xml"); 
		HolaMundo holamundo = (HolaMundo)appContext.getBean("holamundo");
		String hm = holamundo.getSaludo();
//		System.out.println(hm);
		
		Jugador jugador = (Jugador) appContext.getBean("jugador");
		System.out.println("Nombre jugador: " + jugador.getNombre());
		System.out.println("Arma del jugador: " + jugador.getArma().getNombre());
		System.out.println("Energia del jugador: " + jugador.getEnergia().getCantidad() + "/" + jugador.getEnergia().getMaxCant());
		System.out.println("Poder del jugador: " + jugador.getEnergia().isPoder());
		
		Jugador jugador2 = (Jugador) appContext.getBean("jugador");
		jugador2.setNombre("Juliku");
		System.out.println("Nombre jugador: " + jugador2.getNombre());
		System.out.println("Arma del jugador: " + jugador2.getArma().getNombre());
		System.out.println("Energia del jugador: " + jugador2.getEnergia().getCantidad() + "/" + jugador.getEnergia().getMaxCant());
		System.out.println("Poder del jugador: " + jugador2.getEnergia().isPoder());
		
		
		System.out.println("Nombre jugador: " + jugador.getNombre());
		System.out.println("Arma del jugador: " + jugador.getArma().getNombre());
		System.out.println("Energia del jugador: " + jugador.getEnergia().getCantidad() + "/" + jugador.getEnergia().getMaxCant());
		System.out.println("Poder del jugador: " + jugador.getEnergia().isPoder());
	}

}
