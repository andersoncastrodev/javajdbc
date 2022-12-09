package com.asoft.Executar;

import java.util.List;

import com.asoft.Conection.DaoFactory;
import com.asoft.dao.ClienteDao;
import com.asoft.model.Cliente;

public class ConsultaTodosClientes {

	public static void main(String[] args) {
		
		ClienteDao clienteDao = DaoFactory.getDaoFactory().getClienteDao();
		
		List<Cliente> clientes = clienteDao.buscaTodosCliente();
			
		
		if(clientes != null) {
			System.out.println("---- Clientes Encontrados --------");
			
			for (Cliente cliente : clientes) {
				
				System.out.println("Codigo: "+ cliente.getCodigo());
				System.out.println("Nome: "+ cliente.getNome());
				System.out.println("Telefone: "+ cliente.getTelefone());
				
				System.out.println("---------------------------------");
			}
			
			
		}else {
			System.out.println("Não foi encontra nenhum cliente");
		}

	}

}
