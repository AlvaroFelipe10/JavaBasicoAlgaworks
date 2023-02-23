package com.algaworks.curso.fjoo.Fibonacci;

public class Fibonacci {
	
	// F(n) = F(n-1) + F(n-2)
	//1, 1, 2, 3, 5, 8, ...
	// F(0) = 0, F(1) = 1
	public static long calcula(long posicao) {
		if (posicao == 0 || posicao == 1) {
			return 1; 
		}
		
		long valor1 = calcula(posicao - 1);
		long valor2 = calcula(posicao - 2);
		return valor1 + valor2;
 
	}
}
