package com.asoft.dao;

import com.asoft.model.Cliente;

public interface ClienteDao {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(long l);
	
}
