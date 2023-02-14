package com.algaworks.curso.fjoo.corretora;

public class Barco implements Seguravel {
	
	private double valorMercado;
	private int anoFabricacao;
	
	public Barco(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
}
		
	@Override
	public double calcularValorApolice() {
		// c�lculos fict�cios do valor de uma ap�lice de um carro
		double valorApolice = this.valorMercado * 0.04;
		if (anoFabricacao < 2015) {
			valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco ano " + this.anoFabricacao + " com valor de mercado "
				+ this.valorMercado;
	}

}
