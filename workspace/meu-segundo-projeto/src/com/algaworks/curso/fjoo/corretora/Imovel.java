package com.algaworks.curso.fjoo.corretora;

public class Imovel implements Seguravel{
	
	private double valorMercado;
	private int areaConstruida;
	
	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}
	
	@Override
	public String obterDescricao() {
		return "Im?vel com ?rea constru?da de " + this.areaConstruida + "m2 e valor de mercado "
				+ this.valorMercado;
	}


	@Override
	public double calcularValorApolice() {
		// c?lculos fict?cios do valor de uma ap?lice de um im?vel
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

}
