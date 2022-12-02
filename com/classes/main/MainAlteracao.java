package com.classes.main;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;
//import com.classes.BO.VendedorBO;
//import com.classes.DTO.Vendedor;
//import com.classes.BO.ProdutoBO;
//import com.classes.DTO.Produto;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente(1,"Novo Cliente");
		clienteBO.alterar(cliente);
		cliente = clienteBO.procurarPorId(cliente);
		System.out.println(cliente);
		
//		ProdutoBO produtoBO = new ProdutoBO();
//		Produto produto = new Produto(1,"Novo Produto");
//		produtoBO.alterar(produto);
//		produto = produtoBO.procurarPorId(produto);
//		System.out.println(produto);
//		
//		VendedorBO vendedorBO = new VendedorBO();
//		Vendedor vendedor = new Vendedor(1,"Novo Vendedor");
//		vendedorBO.alterar(vendedor);
//		vendedor = vendedorBO.procurarPorId(vendedor);
//		System.out.println(vendedor);
		
	}
}