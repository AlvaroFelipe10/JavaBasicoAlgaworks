package com.algaworks.curso.fjoo.pagamento;

public interface Operadora {
	
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);

}
