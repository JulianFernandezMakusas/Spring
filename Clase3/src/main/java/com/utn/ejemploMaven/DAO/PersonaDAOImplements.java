package com.utn.ejemploMaven.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.utn.ejemploMaven.bean.Persona;

@Repository
public class PersonaDAOImplements implements PersonaDAO {

	Persona persona;

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Connection con = null;

	private PreparedStatement stmt = null;

	public Persona buscarPersona(int id) {
		String query = "SELECT * FROM base_de_datos_persona WHERE ID = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/base_de_datos_persona";
			con = DriverManager.getConnection(url, "root", "root");

			stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int idrs = rs.getInt(1);
				int dni = rs.getInt(2);
				String nombre = rs.getString(3);

				persona = new Persona(idrs, dni, nombre);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return persona;
	}

	@Override
	public int cantPersonas() {
		String query = "SELECT COUNT(*) FROM base_de_datos_persona";
		return jdbcTemplate.queryForInt(query);
	}
	

}