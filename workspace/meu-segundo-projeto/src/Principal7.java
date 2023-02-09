import java.util.Scanner;

public class Principal7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//obt�m a quantidade de produtos que o usu�rio deseja informar
		System.out.println("Quantos produtos?");
		int quantidadeProdutos = entrada.nextInt();
		
		//Precisamos dessa linha para garantir que uma nova linha seja lida,
		//pois nextInt n�o l� uma nova linha, mas apenas um n�mero.
		//Fica feio, mas tente nao coloca-la para ver o que acontece
		entrada.nextLine();
		
		// instacia um objeto da classe estoque
		Estoque estoque = new Estoque();
		
		//instacia um array de produtos com a quantidade de
		//posi�oes que o usuario informou
		
		estoque.produtos = new Produto1[quantidadeProdutos];
		
		//percorre todas as posi�oes no array (que es�o nulas)
		// e preenche uma opr uma com a entrada do teclado do usu�rio
		
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto1();
			
			System.out.println("\nProduto " + i);
			System.out.println("-----------------------");
			
			System.out.println("Descri��o: ");
			estoque.produtos[i].descricao = entrada.nextLine();
			
			System.out.println("Quantidade de itens:");
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}
		estoque.listarProdutos();
	}

}
