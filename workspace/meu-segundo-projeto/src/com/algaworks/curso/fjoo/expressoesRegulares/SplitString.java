package com.algaworks.curso.fjoo.expressoesRegulares;

public class SplitString {
	public static void main(String[] args) {
		
	
	String texto = "O434Java4é567uma76linguagem12orientada3a6objetos.";

	String[] palavras = texto.split("\\d+");
	for (String palavra : palavras) {
		System.out.println(palavra);
	}
}
}
