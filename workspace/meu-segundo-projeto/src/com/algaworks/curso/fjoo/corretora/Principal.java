package com.algaworks.curso.fjoo.corretora;

public class Principal {
	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		Barco meuBarco = new Barco(600000, 2015);
		Notebook meuNotebook = new Notebook(1000, 16);
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuBarco);
		corretora.fazerPropostaSeguro(meuNotebook);
	}

}
