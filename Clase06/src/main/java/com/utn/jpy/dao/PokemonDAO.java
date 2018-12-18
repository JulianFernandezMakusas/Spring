package com.utn.jpy.dao;

import org.springframework.stereotype.Repository;

import com.utn.jpy.beans.Pokemon;

@Repository
public interface PokemonDAO {

	public Pokemon buscarPokemon(String nombre);
	
	public void ingresarPokemon (Pokemon pokemon);
		
	public Pokemon comprarPokemon();
	
}
