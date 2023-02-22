package com.algaworks.curso.fjoo.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("Alvaro"));
		funcionarios.add(new Funcionario("Ana"));
		
		for(Funcionario f : funcionarios) {
			System.out.println("Nome do funcionario: " + f.getNome());
		}
		
	}
}
