

public class ContaPagar {

	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;

	public ContaPagar() {

	}

	public ContaPagar(String fornecedor, String descricao, double valor, String dataVencimento) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = new Fornecedor(fornecedor);
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void pagar() {
		System.out.println("Descrição da conta: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("Data de Vencimento: " + this.dataVencimento);
		System.out.println("Fornecedor: " + this.fornecedor.getNome());

	}

}