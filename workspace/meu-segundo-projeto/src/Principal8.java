

public class Principal8 {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor("Casa & Cia Negócios Imobiliários");// passando o nome do fornecedor por
																					// parametro
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");// passando o nome do fornecedor pelo objeto

		Fornecedor mercado = new Fornecedor("Mercado do João");// passando o nome do fornecedor por parametro
		mercado.setNome("Mercado do João");// passando o nome do fornecedor pelo objeto

//novo fornecedor, passando o nome pelo objeto:
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("CELPE");

		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);

		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");

		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");

//nova conta, passando o nome do fornecedor pelo parametro
		ContaPagar conta4 = new ContaPagar("NET", "Internet da filial", 400d, "31/01/2023");

		ContaPagar conta5 = new ContaPagar(fornecedor, "Energia do mês de jan/23", 890d, "31/01/2023");

		conta1.pagar();
		conta2.pagar();
		conta3.pagar();
		conta4.pagar();
		conta5.pagar();
	}

}