
public class Estoque {
	Produto1[] produtos;
	
	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("-----------------------");
		
		for(int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}

}
