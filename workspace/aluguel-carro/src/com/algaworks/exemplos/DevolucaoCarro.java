package com.algaworks.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.algaworks.model.Aluguel;
import com.algaworks.model.Carro;
import com.algaworks.model.Cliente;

public class DevolucaoCarro {

	public static void main(String[] args) {
		Aluguel aluguel = recuperaAluguel();
		
		//Para cada hora de atraso, ele paga 10% do valor do carro em multa
		LocalDateTime dataEHoraDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(3), LocalTime.now());
		aluguel.setDataEhoraDaDevolucao(dataEHoraDaDevolucao);
		aluguel.imprimeFatura();
		
	}
	
	private static Aluguel recuperaAluguel() {
		Cliente cliente = new Cliente ("João Silva", LocalDate.of(1985, Month.AUGUST, 8));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataEHoraDaRetirada = 
				LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataEHoraPrevistaDevolucao = 
				LocalDateTime.now().plusDays(3).plusHours(2);
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaDevolucao); 
		return aluguel;
	}
}
