package com.utn.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.utn.spring.beans.Persona;

@Repository
public class PersonaDAOImpl implements PersonaDAO{
	
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	private Connection con = null;
	private PreparedStatement stmt = null;
	
	public int cantidadPersonas(){
		String sql = "SELECT COUNT(*) FROM bd_personas";
		return jdbcTemplate.queryForObject(sql,Integer.class);
	}


	public String buscarNombre (int id) {
		String sql = "SELECT nombre FROM bd_personas WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, String.class);	
	}
	
	public Persona buscarPersona (int id) {
		String sql = "SELECT * FROM bd_personas WHERE id = ?";
		return jdbcTemplate.queryForObject(sql,new Object[] {id}, new personaMaper());
	}

	
		
	public static final class personaMaper implements RowMapper<Persona>{

		@Override
		public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Persona persona = new Persona();
			
			persona.setId(rs.getInt("id"));
			persona.setDni(rs.getInt("dni"));
			persona.setNombre(rs.getString("nombre"));
			
			return persona;
		}
		
	}



	@Override
	public List<Persona> buscarPersonas() {
		String sql = "SELECT * FROM bd_personas";
		return jdbcTemplate.query(sql, new personaMaper());
	}


	@Override
	public void insertarPersona(Persona insertar) {
		String sql = "INSERT INTO bd_personas VALUES (?,?)";
		jdbcTemplate.update(sql, new Object[] {null,insertar.getDni(),insertar.getNombre()});
	}
	
}
