package com.algaworks.curso.fjoo.exercicio;

public class TesteMatematica {

	public static void main(String[] args) {
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("N�mero de Fibonacci da posi��o 8: " + numeroFibonacci);

		double areaCirculo = MatematicaUtil.calculandoAreaCirculo(15);
		System.out.printf("�rea do c�rculo: " + "%.3f", areaCirculo);
		
		double volumeCilindro = MatematicaUtil.calculandoVolumeCilindro(0.15d,1d);
		System.out.printf("Volume do clindro: " + "%.3f", volumeCilindro);
	}
}