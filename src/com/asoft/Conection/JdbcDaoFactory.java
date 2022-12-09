package com.asoft.Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.asoft.dao.ClienteDao;
import com.asoft.jdbc.ClienteJdbc;

public class JdbcDaoFactory extends DaoFactory {

	
	private Connection connection;
	
	public JdbcDaoFactory() {
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/bdjdbc","admin","123456");
			
		} catch (SQLException | ClassNotFoundException e) {
		
			throw new RuntimeException("Erro recuperando conexao com o banco", e);
		}
		
	}

	@Override
	public ClienteDao getClienteDao() {
		
		return new ClienteJdbc(connection);
	}
}
