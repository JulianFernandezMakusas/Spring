package com.utn.jpy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mysql.cj.api.mysqla.result.Resultset;
import com.utn.jpy.beans.Pokemon;

@Repository
public class PokemonDAOImpl implements PokemonDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Pokemon buscarPokemon(String nombre) {
		String sql = "SELECT * FORM pokemons WHERE nombre = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { nombre }, new PokemonMapper());
	}

	@Override
	public void ingresarPokemon(Pokemon pokemon) {
		String sql = "INSERT INTO pokemons () VALUES (?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { null,
				pokemon.getNombre(),
				pokemon.getEnergia(),
				pokemon.getTipo(),
				pokemon.getAtaque(), 
				pokemon.getDefensa() });
	}

	@Override
	public Pokemon comprarPokemon() {

		return null;
	}

	private static final class PokemonMapper implements RowMapper<Pokemon> {

		@Override
		public Pokemon mapRow(ResultSet rs, int rowNum) throws SQLException {
			Pokemon pokemon = new Pokemon();

			pokemon.setIdPokemon(rs.getInt("idPokemon"));
			pokemon.setNombre(rs.getString("nombre"));
			pokemon.setEnergia(rs.getInt("energia"));
			pokemon.setTipo(rs.getString("tipo"));
			pokemon.setAtaque(rs.getInt("ataque"));
			pokemon.setDefensa(rs.getInt("defensa"));

			return pokemon;
		}

	}
}
