package com.algaworks.curso.fjoo.caixa;

import com.algaworks.curso.fjoo.impressao.Impressora;
import com.algaworks.curso.fjoo.pagamento.Cartao;
import com.algaworks.curso.fjoo.pagamento.Operadora;

public class Checkout {
	
	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	} 
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
			System.out.println("Compra feita com sucesso");
		} else {
			System.out.println("Pagamento foi negado!");
		}
	}
}
