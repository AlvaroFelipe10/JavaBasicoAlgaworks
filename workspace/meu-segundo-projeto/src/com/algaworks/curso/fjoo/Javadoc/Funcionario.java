package com.algaworks.curso.fjoo.Javadoc;

/**
 * Representa um funcionario da empresa...
 * 
 * @author Alvaro Felipe
 *
 */

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Calcula o adiantamento em dinheiro que devera ser pago ao funcionario.
	 * 
	 * <p>O valor da diaria � calculado dividindo-se o <b>salario base por 30 (dias do mes)</b>.</p>
	 * 
	 * Caso o destino for uma capital, � adicionado 20% no valor do adiantamento.
	 * 
	 * @param 	dias
	 * 			Quantidade de dias da viagem.
	 * @param 	capital
	 * 			Indica se � ou n�o uma capital brasileira.
	 *  
	 * @return 	O valor em reais do adiantamento
	 * 
	 * @throws 	IllegalArgumentException
	 * 			Caso {@code dias} for menor ou igual a zero
	 * 
	 * @since 	1.1.0
	 * 
	 * @see Viagem
	 */
	
	
	public double adiantamentoViagem(int dias, boolean capital) {
		if(dias <= 0) {
			throw new IllegalArgumentException("Dias deve ser maior que zero.");
		}
		double valorDiaria = salario / 30;
		
		
		double valorAdiantamento = valorDiaria * dias;
		if (capital) {
			valorAdiantamento *= 1.20;
		}
		
		return valorAdiantamento;
	}

}
