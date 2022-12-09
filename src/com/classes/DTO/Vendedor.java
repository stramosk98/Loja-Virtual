package com.classes.DTO;

public class Vendedor {
	
	private int idVendedor;
	private String nomeVendedor;
	
	public Vendedor() {
		
	}
	
	public Vendedor(int idVendedor) {
		super();
		this.idVendedor = idVendedor;
	}
	
	public Vendedor(String nomeVendedor) {
		super();
		this.nomeVendedor = nomeVendedor;
	}
	
	public Vendedor(int idVendedor, String nomeVendedor) {
		super();
		this.idVendedor = idVendedor;
		this.nomeVendedor = nomeVendedor;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendedor [idVendedor=");
		builder.append(idVendedor);
		builder.append(", nomeVendedor=");
		builder.append(nomeVendedor);
		builder.append("]");
		return builder.toString();
	}

}