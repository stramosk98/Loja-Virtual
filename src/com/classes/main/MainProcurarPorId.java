package com.classes.main;

import com.classes.BO.AdminBO;
import com.classes.DTO.Admin;

public class MainProcurarPorId {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		AdminBO adminBO = new AdminBO();
		Admin admin = new Admin(1,"");
		admin = adminBO.procurarPorId(admin);
		System.out.println(admin);
		
	}
}