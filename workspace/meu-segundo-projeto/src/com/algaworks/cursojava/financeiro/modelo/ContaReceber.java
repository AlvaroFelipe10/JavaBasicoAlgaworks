package com.algaworks.cursojava.financeiro.modelo;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	
	public ContaReceber() {
		
	}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	public void exibirDetalhes() {
		System.out.println("_______________________________________________");
		System.out.println("       Detalhamento das Contas a Paga          ");
		System.out.println("_______________________________________________");
		System.out.println("Descri��o: " + getDescricao());
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Situa��o: " + getSituacaoConta());
	}
	
	
	public void cancelar() {
		
		if(this.getValor() > 50000d) {
			
		System.out.println("Essa conta n�o pode ser CANCELADA.");
		
	} else {
		
		super.cancelar();

		}
	}
	
	public void receber() {
			
			if (SituacaoConta.PAGA.equals(getSituacaoConta())) {
				System.out.println("A conta " + getDescricao() + " j� est� PAGA.");
				
			} else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())){
				System.out.println("Esta conta foi CANCELADA.");
				
				} else {
					System.out.println("Efetuando pagamento da conta " + getDescricao() + ", no valor de R$ " 
							+ getValor() + " com vencimento para " + getDataVencimento() 
							+ ", relativo ao fornecedor: " + getCliente().getNome() + " .");
					
					this.situacaoConta = SituacaoConta.PAGA;
				}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}