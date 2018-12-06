package com.utn.ejemploMaven.EjemploMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.ejemploMaven.DAO.PersonaDAOImplements;
import com.utn.ejemploMaven.bean.Persona;

public class Main {

	public static void main(String[] args) {
				
		Persona persona;
		
		int id =2;
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utn/ejemploMaven/BeanConfigurationFile.xml");
		
		PersonaDAOImplements personaDAOImplements = new PersonaDAOImplements();
		
		persona = personaDAOImplements.buscarPersona(2);
		
		System.out.println("Datos de la persona: " + id);
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("DNI: " + persona.getDni());
		System.out.println("Cantidad de personas: " + personaDAOImplements.cantPersonas());
		
	}

}
