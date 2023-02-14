package com.algaworks.curso.fjoo.impressao.impressoras;

import com.algaworks.curso.fjoo.impressao.Impressora;
import com.algaworks.curso.fjoo.impressao.Imprimivel;

public class impressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("***************************************");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("***************************************");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("==                EPSON               ==");
		System.out.println("----------------------------------------");
	}

}
