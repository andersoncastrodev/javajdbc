package com.asoft.Executar;

import com.asoft.Conection.DaoFactory;
import com.asoft.dao.ClienteDao;
import com.asoft.model.Cliente;

public class ConsultaCliente {

	public static void main(String[] args) {
		
		ClienteDao clienteDao = DaoFactory.getDaoFactory().getClienteDao();
		
		Cliente cliente = clienteDao.buscarPeloCodigo(3L);
		
		if(cliente != null) {
			
			System.out.println("------------ Cliente Encontrado ----------");
			System.out.println("Codigo: "+ cliente.getCodigo());
			System.out.println("Nome: "+ cliente.getNome());
			System.out.println("Telefone: "+ cliente.getTelefone());
			
			
		}else {
			
		}

	}

}
