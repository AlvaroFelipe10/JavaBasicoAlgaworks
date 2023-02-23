package com.algaworks.teste;

import com.algaworks.compra.Compra;
import com.algaworks.impressao.Impressora;
import com.algaworks.impressao.impressoras.ImpressoraHP;

public class Teste {
	
	public static void main(String[] args) {
		//Impressora i = new ImpressoraHP();
		
		/*
		 * Impressora i = () -> { System.out.println("Simulando a impressão."); };
		 */	
		
		Impressora i = (c) -> {
			System.out.println("Simulando a impressão. Seria impresso: " + c);
		};
		
		Compra compra = new Compra("Sabonte", 2.5); 
		i.imprimir(compra);
		
	}

}
