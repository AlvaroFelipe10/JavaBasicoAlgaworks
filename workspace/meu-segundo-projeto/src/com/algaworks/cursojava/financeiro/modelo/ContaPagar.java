package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	
		
	ContaPagar() {
			
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao (descricao);
		this.setValor (valor);
		this.setDataVencimento (dataVencimento);
	}
	
	public void exibirDetalhes() {
		
		System.out.println("_______________________________________________");
		System.out.println("       Detalhamento das Contas a Receber       ");
		System.out.println("_______________________________________________");
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Fornecedor: " + getFornecedor().getNome());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Situação: " + getSituacaoConta());
	}
	
	public void pagar() {
		
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("A conta " + getDescricao() + " já está PAGA.");
			
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
			System.out.println("Esta conta foi CANCELADA.");
			
			} else {
				System.out.println("Efetuando pagamento da conta " + getDescricao() + ", no valor de R$ " 
						+ getValor() + " com vencimento para " + getDataVencimento() 
						+ ", relativo ao fornecedor: " + getFornecedor().getNome() + " .");
				
				this.situacaoConta = SituacaoConta.PAGA;
			}
		
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	


}