package com.asoft.dao;

import java.util.List;

import com.asoft.model.Cliente;

public interface ClienteDao {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(long l);

	public List<Cliente> buscaTodosCliente();
	
}
