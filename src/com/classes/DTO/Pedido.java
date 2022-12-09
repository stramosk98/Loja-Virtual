package com.classes.DTO;

public class Pedido {
	
	private int idPedido;
	private int idCliente;
	private boolean orcamento;
	
	public Pedido() {
		
	}
	
	public Pedido(int idPedido) {
		super();
		this.idPedido = idPedido;
	}

	public Pedido(int idPedido, int idCliente) {
		super();
		this.idPedido = idPedido;
		this.idCliente = idCliente;
	}

	public Pedido(int idPedido, int idCliente, boolean orcamento) {
		super();
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.orcamento = orcamento;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int i) {
		this.idCliente = i;
	}

	public boolean isOrcamento() {
		return orcamento;
	}

	public void setOrcamento(boolean orcamento) {
		this.orcamento = orcamento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [idPedido=");
		builder.append(idPedido);
		builder.append(", idCliente=");
		builder.append(idCliente);
		builder.append(", orcamento=");
		builder.append(orcamento);
		builder.append("]");
		return builder.toString();
	}
	
}