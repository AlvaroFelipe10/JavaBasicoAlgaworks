package com.algaworks.curso.fjoo.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alvaro");
		Aluno a2 = new Aluno("Ana");
		Aluno a3 = new Aluno("Augusto");
		Aluno a4 = new Aluno("Medina");

		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);

		imprimirAlunos(alunos);
		
		Aluno recuperadoAluno = alunos.get("3");
		System.out.println("Aluno de chave 3: " + recuperadoAluno.getNome());

	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
