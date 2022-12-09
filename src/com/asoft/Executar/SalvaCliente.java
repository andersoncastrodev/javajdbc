package com.asoft.Executar;

import com.asoft.Conection.DaoFactory;
import com.asoft.dao.ClienteDao;
import com.asoft.model.Cliente;

public class SalvaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Joao");
		cliente.setTelefone("8598888-4444");
		
	
		ClienteDao clienteDao = DaoFactory.getDaoFactory().getClienteDao();
		
		clienteDao.salvar(cliente);
		
		System.out.println("Salvo com sucesso.");
		
		

	}

}
