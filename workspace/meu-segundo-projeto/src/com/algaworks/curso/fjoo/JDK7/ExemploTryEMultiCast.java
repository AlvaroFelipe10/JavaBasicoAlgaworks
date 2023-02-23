package com.algaworks.curso.fjoo.JDK7;

import java.util.Scanner;

public class ExemploTryEMultiCast {

	public static void main(String[] args) {
	try (Scanner entrada = new Scanner(System.in)){
		
		System.out.println("Informe seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe sua idade");
		String idade = entrada.nextLine();
		
		try {
			SalvarAluno.salvar(nome, idade);
		}catch (NegocioException | NumberFormatException e) {
			System.err
			.println("Imposs�vel completar opera��o. Motivo: " + e.getMessage());
		}
	}

	}

}
