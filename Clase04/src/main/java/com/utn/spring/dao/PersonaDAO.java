package com.utn.spring.dao;



import java.util.List;

import com.utn.spring.beans.Persona;

public interface PersonaDAO {
		
	public int cantidadPersonas();
	
	public String buscarNombre(int id);
	
	public Persona buscarPersona(int id);
	
	public List<Persona> buscarPersonas();
	
	public void insertarPersona (Persona insertar);
}
