package com.asoft.Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDaoFactory extends DaoFactory {

	
	private Connection connection;
	
	public JdbcDaoFactory() {
	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/bdjdbc","admin","123456");
			
		} catch (SQLException | ClassNotFoundException e) {
		
			throw new RuntimeException("Erro recuperando conexao com o banco", e);
		}
		
	}
}
