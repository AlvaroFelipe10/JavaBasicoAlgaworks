package com.algaworks.curso.fjoo.JDK7;

public class SwitchCaseComString {

	public static void main(String[] args) {
		String carro = "Audi";
		
		/*
		 * if(carro.equals("Audi")) { System.out.println("Alemao"); } else if
		 * (carro.equals("Ferrari")) { System.out.println("Italiana"); } else if
		 * (carro.equals("Honda")) {
		 * 
		 * }
		 */
		
		switch(carro) {
		case "Audi":
			System.out.println("Alemão");
			break;
		case "Ferrari":
			System.out.println("Italiana");
			break;
		case "Honda":
			System.out.println("Japonês");
			break;
			default:
				System.out.println("Nao informou nenhum carro!");
		}
		
		
	}
} 
