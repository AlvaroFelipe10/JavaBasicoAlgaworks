package com.algaworks.curso.fjoo.treinoAlvaro;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int entradaValor1 = n.nextInt();
		System.out.println("Digite outro n�mero: ");
		int entradaValor2 = n.nextInt();
		
		System.out.println("A soma dos numeros � = " + (entradaValor1 + entradaValor2));
		
	}

}
