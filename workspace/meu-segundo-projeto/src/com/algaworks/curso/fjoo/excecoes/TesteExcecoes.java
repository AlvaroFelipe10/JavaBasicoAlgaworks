package com.algaworks.curso.fjoo.excecoes;

public class TesteExcecoes {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.depositar(-10);
			// Varias linhas de c�digo...
		} catch (IllegalArgumentException e) {
			System.out.println("Voc� executou uma opera��o ilegal: " + e.getMessage());
		}
	}
}
