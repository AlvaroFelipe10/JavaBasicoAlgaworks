package com.algaworks.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;
	
	private LocalDateTime dataEHoraDaRetirada;
	private LocalDateTime dataEHoraPrevisaoDevolucao;
	private LocalDateTime dataEhoraDaDevolucao;
	
	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada,
			LocalDateTime dataEHoraPrevisaoDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
		this.dataEHoraPrevisaoDevolucao = dataEHoraPrevisaoDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public LocalDateTime getDataEHoraDaRetirada() {
		return dataEHoraDaRetirada;
	}

	public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
	}

	public LocalDateTime getDataEHoraPrevisaoDevolucao() {
		return dataEHoraPrevisaoDevolucao;
	}

	public void setDataEHoraPrevisaoDevolucao(LocalDateTime dataEHoraPrevisaoDevolucao) {
		this.dataEHoraPrevisaoDevolucao = dataEHoraPrevisaoDevolucao;
	}

	public LocalDateTime getDataEhoraDaDevolucao() {
		return dataEhoraDaDevolucao;
	}

	public void setDataEhoraDaDevolucao(LocalDateTime dataEhoraDaDevolucao) {
		this.dataEhoraDaDevolucao = dataEhoraDaDevolucao;
	}
	
	public void imprimeFatura() {
		Duration duration = Duration.between(dataEHoraPrevisaoDevolucao, dataEhoraDaDevolucao);
		System.out.println(">>>>>>>>>>>> Fatura <<<<<<<<<<<<");
		if(!duration.isNegative()) {
		double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
		System.out.printf("Valor da multa: R$ %.2f. Pois você atrasou %d dias. ", + multa, duration.toHours());
	} else {
		System.out.println("Obrigado. Você foi pontual");
	}
}
}
