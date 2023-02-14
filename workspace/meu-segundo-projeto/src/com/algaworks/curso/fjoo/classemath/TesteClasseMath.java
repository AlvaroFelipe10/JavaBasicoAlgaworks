package com.algaworks.curso.fjoo.classemath;
import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {
	
	public static void main(String[] args) {
		// Comprimento de uma circunferencia 2 x r x PI (3,1415)
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento);
		
		// Maximo e Minimo
		double[] precosProdutosA = {30.20, 25.49};
		double maiorPreco = max(precosProdutosA[0], precosProdutosA[1]);
		System.out.println("Maior preço: " + maiorPreco);
		System.out.println("Menor preço: " + Math.min(precosProdutosA[0], precosProdutosA[1]));
		
		// Potência
		System.out.println("2^3: " + Math.pow(2, 3));
		
		// Raiz quadrada 
		System.out.println("Raiz de 9: " + Math.sqrt(9));
		
		// Arredontamento ceil, floor e round
		double n = 5.68;
		System.out.println("Menor inteiro: " + Math.floor(n));
		System.out.println("Maior inteiro: " + Math.ceil(n));
		System.out.println("Arredondando: " + Math.round(n));
		
		//Números randomicos voce coloca * quanto voce quer, se nao ele faz do 0 ate 1
		double numeroAleatorio = Math.random() * 100;
		System.out.println(numeroAleatorio);
	}
}
