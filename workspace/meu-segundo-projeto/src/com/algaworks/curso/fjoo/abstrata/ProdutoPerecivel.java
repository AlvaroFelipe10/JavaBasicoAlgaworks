package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto {

	
	String dataValidade; //Por enquanto, at� aprendermos a classe Date
	
	public void imprimirDescricao() {
		//Digital a l�gica...
		System.out.println("Descri�ao: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
		
	}

}
