package com.utn.spring.Clase03;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.spring.beans.Persona;
import com.utn.spring.dao.PersonaDAO;
import com.utn.spring.dao.PersonaDAOImpl;

public class Test {

	public static void main(String[] args) {
		
		Persona persona;
		int id = 3;
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utn/spring/xml/beans.xml");
		
		PersonaDAO personaDao = (PersonaDAO) appContext.getBean("personaDAOImpl");
		
		System.out.println("Cantidad de Personas: " +personaDao.cantidadPersonas());
		
		System.out.println("el nombre de la persona con id = " + id + " es: " + personaDao.buscarNombre(id));
		
		System.out.println("La persona con id = " + id + "es: " + personaDao.buscarPersona(id).getNombre() + " " + personaDao.buscarPersona(id).getDni());
		
		List<Persona> listaPersonas = personaDao.buscarPersonas();
		
		for (Persona persona2 : listaPersonas) {
			System.out.println("Nombre:" + persona2.getNombre());
			System.out.println("DNI:" + persona2.getDni());
		}
		persona = new Persona();
		personaDao.insertarPersona(persona);
	
	}

}