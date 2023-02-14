package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.financeiro.modelo.Conta;

public class RelatorioContas {
	
	public void ExibirListagem(Conta[] contas) {
		
		System.out.println("=============================================");
		System.out.println("             RELATÓRIO DE CONTAS             ");
		System.out.println("=============================================");
		
		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();

		}
			
	}

}
