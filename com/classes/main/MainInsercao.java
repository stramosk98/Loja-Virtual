package com.classes.main;

import com.classes.BO.AdminBO;
import com.classes.DTO.Admin;

public class MainInsercao {
	public static void main(String[] args) {
		
		// Teste Inserir
		AdminBO adminBO = new AdminBO();
		Admin admin = new Admin("UserAdmin");
		if (adminBO.inserir(admin))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
	}
	
}