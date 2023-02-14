package com.algaworks.curso.fjoo.sobrecarga;

public class MaquinaCafe {

	int acucarDisponivel;

	private int QUANTIDADE_PADRAO = 10;
	void fazerCafe() {
	   fazerCafe(QUANTIDADE_PADRAO);
	   
	}
	void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("N�o h� a�ucar suficiente para fazer seu caf�.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de a�ucar.");
		}
	}

}
