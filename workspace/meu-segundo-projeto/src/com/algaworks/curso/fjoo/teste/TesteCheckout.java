package com.algaworks.curso.fjoo.teste;

import com.algaworks.curso.fjoo.caixa.Checkout;
import com.algaworks.curso.fjoo.caixa.Compra;
import com.algaworks.curso.fjoo.impressao.Impressora;
import com.algaworks.curso.fjoo.impressao.impressoras.impressoraEpson;
import com.algaworks.curso.fjoo.pagamento.Cartao;
import com.algaworks.curso.fjoo.pagamento.Operadora;
import com.algaworks.curso.fjoo.pagamento.operadoras.Cielo;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Cielo();
		Impressora impressora = new impressoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Alvaro F Abadesso");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Alvaro Felipe Abadesso");
		compra.setProduto("cerveja");
		compra.setValorTotal(3.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
}
