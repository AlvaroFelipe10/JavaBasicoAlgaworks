package com.algaworks.curso.dao.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private Connection connection;
	
	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro.cliente?useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&characterEncoding=UTF-8", "root", "Alvana0307");
		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conex�o com o banco", e);
		}
	}
	
	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}
	
}
