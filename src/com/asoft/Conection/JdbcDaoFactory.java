package com.asoft.Conection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.asoft.dao.ClienteDao;
import com.asoft.jdbc.ClienteJdbc;

public class JdbcDaoFactory extends DaoFactory {

	
	private Connection connection;
	
	private Properties properties;
	
	public JdbcDaoFactory() {
	
		try {
			properties = new Properties();
			
			properties.load( new FileInputStream("./config/config.properties"));
			
			Class.forName(properties.getProperty("banco.dados.classname"));
			
			this.connection = DriverManager.getConnection(properties.getProperty("banco.dados.url"),properties.getProperty("banco.dados.usuario"),properties.getProperty("banco.dados.senha"));
			
		} catch (SQLException | ClassNotFoundException | IOException e) {
		
			throw new RuntimeException("Erro recuperando conexao com o banco", e);
		} 
		
	}

	@Override
	public ClienteDao getClienteDao() {
		
		return new ClienteJdbc(connection);
	}
}
