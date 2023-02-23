package com.algaworks.exemplo;

import java.util.List;

import com.algaworks.dao.FaturaDAO;
import com.algaworks.modelo.Fatura;
import com.algaworks.util.EnviadorEmail;

public class ExemploLambda {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadorEmail eviadorEmail = new EnviadorEmail();
		
		/*
		 * for (Fatura f : faturasVencidas) { eviadorEmail.enviar(f.getEmailDevedor(),
		 * f.resumo());
		 * 
		 * }
		 */
		
		faturasVencidas.forEach(f -> {		
		eviadorEmail.enviar(f.getEmailDevedor(),f.resumo());
		f.setEmailEviado(true);
		});
		
	}

}
