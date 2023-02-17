package com.algaworks.curso.fjoo.strings;

public class ExemploClasseString5 {
	
	public static void main(String[] args) {
		//public String substring(int beginIndex);
		//public String substring(int, beginIndex, int endIndex);
		
		String s = "Desenvolvimento Java";
		System.out.println(s.substring(16));
		System.out.println(s);
		
		String s2 = "Cursos online de desenvolvimento de softaware";
		System.out.println(s2.substring(7, 12));
 }
}
