package com.classes.DTO;

public class Admin {
	
	private int idAdmin;
	private String nomeAdmin;
	
	public Admin() {
	}
	
	public Admin(int idAdmin) {
		super();
		this.idAdmin = idAdmin;
	}
	
	public Admin(String nomeAdmin) {
		super();
		this.nomeAdmin = nomeAdmin;
	}
	
	public Admin(int idAdmin, String nomeAdmin) {
		super();
		this.idAdmin = idAdmin;
		this.nomeAdmin = nomeAdmin;
	}
	
	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getNomeAdmin() {
		return nomeAdmin;
	}

	public void setNomeAdmin(String nomeAdmin) {
		this.nomeAdmin = nomeAdmin;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Admin [idAdmin=");
		builder.append(idAdmin);
		builder.append(", nomeAdmin=");
		builder.append(nomeAdmin);
		builder.append("]");
		return builder.toString();
	}
	
	
}