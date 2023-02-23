package com.algaworks.dao;


import java.util.ArrayList;
import java.util.List;

import com.algaworks.modelo.Fatura;

public class FaturaDAO {

	public List<Fatura> buscarTodasFaturas(){
		//Obviamente você buscaria no banco de dados
		
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("Joao@joao.com", 350.0));
		faturas.add(new Fatura("Maria@maria.com", 150.0));
		faturas.add(new Fatura("Jose@jose.com", 290.0));
		
		return faturas;
		
		
		
	}
}
 