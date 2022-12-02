package com.classes.main;

import com.classes.BO.AdminBO; 
import com.classes.DTO.Admin;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesmo nome
		AdminBO adminBO = new AdminBO();
		Admin admin = new Admin("LG");
		if (adminBO.existe(admin))
			System.out.println("Admin Encontrada");
		else
			System.out.println("Nao Encontrada");
	}
	
}