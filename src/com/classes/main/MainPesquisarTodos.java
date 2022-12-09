package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.AdminBO;
import com.classes.DTO.Admin;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Admins)
		AdminBO adminBO = new AdminBO();
		List<Admin> lista = new ArrayList<Admin>();
		lista = adminBO.pesquisarTodos();	
		for (Admin admin : lista) {
			System.out.println(admin.toString());
		}
	
	}
}