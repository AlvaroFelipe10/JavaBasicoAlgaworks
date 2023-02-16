package com.algaworks.curso.fjoo.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArray {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alvaro");
		Aluno a2 = new Aluno("Ana");
		Aluno a3 = new Aluno("Augusto");
		Aluno a4 = new Aluno("Medina");

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);

		imprimirAlunos(alunos);

	}

	public static void imprimirAlunos(List<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());

		}
	}
}
