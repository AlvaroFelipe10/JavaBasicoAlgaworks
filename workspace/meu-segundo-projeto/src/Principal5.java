
public class Principal5 {
	
	public static void main(String[] args) {
		Preco preco = new Preco();
		preco.valorCustos = 140;
		
		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);
		
		System.out.println("Valor custo: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorCustos);
		System.out.println("Pre�o Venda: " + preco.precoVenda);;
	}
}