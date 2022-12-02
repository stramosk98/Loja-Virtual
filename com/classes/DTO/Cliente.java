package com.classes.DTO;

public class Cliente {
	
	private int idCliente;
	private String nomeCliente;
	private String cpfCliente;
	private String enderecoCliente;
	
	public Cliente() {
		
	}
	
	public Cliente(int idCliente) {
		super();
		this.idCliente = idCliente;
	}
	
	public Cliente(String nomeCliente) {
		super();
		this.nomeCliente = nomeCliente;
	}
	
	public Cliente(int idCliente, String nomeCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
	}
	
	public Cliente(int idCliente, String nomeCliente, String cpfCliente, String enderecoCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
	}

	public int getId() {
		return idCliente;
	}

	public void setId(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", nomeCliente=");
		builder.append(nomeCliente);
		builder.append(", cpfCliente=");
		builder.append(cpfCliente);
		builder.append(", enderecoCliente=");
		builder.append(enderecoCliente);
		builder.append("]");
		return builder.toString();
	}

}