package com.algaworks.curso.fjoo.strings;

public class ExemploClasseString7 {

	public static void main(String[] args) {
		String s = "Curso_online_de_desenvolvimento_de_software";
		
		String[] array = s.split("_");
		for(int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]=" + array[i]);
			
		}

	}

}
