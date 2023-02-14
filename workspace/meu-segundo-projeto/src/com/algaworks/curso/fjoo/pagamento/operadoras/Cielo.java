package com.algaworks.curso.fjoo.pagamento.operadoras;

import com.algaworks.curso.fjoo.pagamento.Autorizavel;
import com.algaworks.curso.fjoo.pagamento.Cartao;
import com.algaworks.curso.fjoo.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}

}
