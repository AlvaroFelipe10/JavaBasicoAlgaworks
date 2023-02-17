package com.algaworks.curso.fjoo.varargs;

public class CorreioEletronico {
	
	public void enviarEmails(String...emails) {
		//Percorrer todos os emails recebidos
		
		for(String email : emails) {
			//envia email
			System.out.println("E-mail enviado para " + email);
		}
	}
}