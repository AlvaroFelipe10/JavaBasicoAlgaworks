package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o preço de um produto");
		double valorProduto = sc.nextDouble();
		
		BigDecimal bd = new BigDecimal(valorProduto);
		bd = bd.divide(BigDecimal.TEN);
		
		DecimalFormat formatador = new DecimalFormat("R$#,##0,00");
		System.out.println(formatador.format(valorProduto));
		
	}
}