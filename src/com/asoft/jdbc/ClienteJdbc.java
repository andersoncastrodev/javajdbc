package com.asoft.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.asoft.dao.ClienteDao;
import com.asoft.exceptions.DaoException;
import com.asoft.model.Cliente;
import com.mysql.cj.protocol.Resultset;

public class ClienteJdbc implements ClienteDao {

	//Objeto conexao
	private Connection connection;
	
	
	public ClienteJdbc(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void salvar(Cliente cliente) {
		
		String sql = String.format("insert into cliente (nome , telefone) values ('%s' , '%s')", cliente.getNome(), cliente.getTelefone());
		
		try {
			
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			//Criando minha propria exceção
			throw new DaoException("Erro salvando cliente",e);
		}finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Cliente buscarPeloCodigo(long codigo) {
		
		Cliente cliente = null;
		
		String sql = String.format("select * from cliente where codigo = %d", codigo);
		
		try {
			
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				cliente.setTelefone(rs.getString("telefone"));
			}
			
			
		} catch (SQLException e) {
			//Criando minha propria exceção
			throw new DaoException("Erro salvando cliente",e);
		}finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return cliente;
	}
	
	

	
}
