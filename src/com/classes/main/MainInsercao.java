package com.classes.main;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainInsercao {
	public static void main(String[] args) {
		
		// Teste Inserir
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("Anton", "212.318.777-22", "Rio do sul");
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");	
	}
	
}