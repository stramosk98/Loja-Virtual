package com.classes.DTO;

public class Produto {
	
	private int idProduto;
	private String nomeProduto;
	
	public Produto() {
		
	}
	
	public Produto(int idProduto) {
		super();
		this.idProduto = idProduto;
	}
	
	public Produto(String nomeProduto) {
		super();
		this.nomeProduto = nomeProduto;
	}
	
	public Produto(int idProduto, String nomeProduto) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
	}
	

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [idProduto=");
		builder.append(idProduto);
		builder.append(", nomeProduto=");
		builder.append(nomeProduto);
		builder.append("]");
		return builder.toString();
	}

	
}