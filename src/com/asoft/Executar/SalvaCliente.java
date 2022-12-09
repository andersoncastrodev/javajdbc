package com.asoft.Executar;

import com.asoft.Conection.DaoFactory;
import com.asoft.dao.ClienteDao;
import com.asoft.model.Cliente;

public class SalvaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Joao");
		cliente.setTelefone("8598888-4444");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria");
		cliente1.setTelefone("8592222-6666");
		
		
		ClienteDao clienteDao = DaoFactory.getDaoFactory().getClienteDao();
		
		clienteDao.salvar(cliente);
		
		
		ClienteDao clienteDao1 = DaoFactory.getDaoFactory().getClienteDao();
		
		clienteDao1.salvar(cliente1);
		
		System.out.println("Salvo com sucesso.");
		
		

	}

}
