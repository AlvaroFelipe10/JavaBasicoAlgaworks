package com.algaworks.curso.fjoo.corretora;

public class Notebook implements Seguravel {

	public double ValorMercado;
	public int memoriaRam;

	public Notebook(double valorMercado, int memoriaRam) {
		ValorMercado = valorMercado;
		this.memoriaRam = memoriaRam;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.ValorMercado * 0.08;
		valorApolice = valorApolice + (memoriaRam * 5);
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Notebook memória " + this.memoriaRam + "GB com valor de mercado " + this.ValorMercado;
	}
}
