package com.algaworks.curso.fjoo.varargs;

public class TesteCorreioEletronico {
	
	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();
		
		// correio.enviarEmails(new String[] {"Joao@jogao.com, "Maria@maria.com"}); assim seria com um arraylist
		
		correio.enviarEmails("Joao@jogar.com", "alvaro@alvaro.com", "medina@medina.com");
	}
}
