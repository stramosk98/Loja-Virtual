package com.classes.main;

import com.classes.BO.AdminBO;
import com.classes.DTO.Admin;

public class MainProcurarPorNome {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		AdminBO adminBO = new AdminBO();
		Admin admin = new Admin("UserAdmin");
		admin = adminBO.procurarPorNome(admin);
		System.out.println(admin);

	}
}