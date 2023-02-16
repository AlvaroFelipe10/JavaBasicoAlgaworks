package com.algaworks.curso.fjoo.collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno>alunos = SimuladorBancoDeDados.buscarAlunos();
		
		// De alguma forma, sorteia o nome do aluno e constr�i o objeto Aluno
		
		Aluno alunoSorteado = new Aluno("Alvaro");
		
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parabens " + alunoSorteado.getNome() + "! Voc� ganhou um brinde");
		} else {
			System.out.println("Aluno nao cadastrado no banco de dados");
		}
	}
}
