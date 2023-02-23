package com.algaworks.modelo;

public class Fatura {
	
	private String emailDevedor;
	private double valor;
	private boolean emailEviado;
	
	public boolean isEmailEviado() {
		return emailEviado;
	}
	public void setEmailEviado(boolean emailEviado) {
		this.emailEviado = emailEviado;
	}
	public Fatura(String emailDevedor, double valor) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
	}
	public String getEmailDevedor() {
		return emailDevedor;
	}
	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String resumo() {
		return "Valor devido: " + this.valor;
	}
}
