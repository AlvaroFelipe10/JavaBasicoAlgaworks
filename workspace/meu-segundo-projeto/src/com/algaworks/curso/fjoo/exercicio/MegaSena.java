package com.algaworks.curso.fjoo.exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira a quantidade de jogos: ");
		int jogos = scanner.nextInt();

		for (int i = 0; i < jogos; i++) {
			int[] jogo = new int[6];

			for (int d = 0; d <= 5; d++) {
				double randomNumber = Math.floor(Math.random() * 60);
				int n = (int) randomNumber;
				jogo[d] = n;
				for (int t : jogo) {
					if (t == jogo[d]) {
						for (int a = 0; a <= 5; a++) {
							if (jogo[d] == jogo[a]) {
								if (a != d) {
									n = (int) Math.floor(Math.random() * 60);
									jogo[d] = n;
								}
							}
						}
					}
				}
			}

			System.out.println("Jogo n° " + (i + 1) + " : " + Arrays.toString(jogo));
		}
	}
}