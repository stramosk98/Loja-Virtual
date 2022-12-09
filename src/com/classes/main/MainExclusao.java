package com.classes.main;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;
//import com.classes.BO.ProdutoBO;
//import com.classes.DTO.Produto;
//import com.classes.BO.VendedorBO;
//import com.classes.DTO.Vendedor;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente(1);
		if (clienteBO.excluir(cliente))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
//		ProdutoBO produtoBO = new ProdutoBO();
//		Produto produto = new Produto(1);
//		if (produtoBO.excluir(produto))
//			System.out.println("Excluido com Sucesso");
//		else
//			System.out.println("Erro ao Excluir");
//		
//		VendedorBO vendedorBO = new VendedorBO();
//		Vendedor vendedor = new Vendedor(1);
//		if (vendedorBO.excluir(vendedor))
//			System.out.println("Excluido com Sucesso");
//		else
//			System.out.println("Erro ao Excluir");
		
	}
}