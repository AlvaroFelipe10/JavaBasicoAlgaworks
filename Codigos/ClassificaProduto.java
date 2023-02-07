import java.util.Scanner;

public class ClassificaProduto{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int codigoProduto = 0;

		do{
			System.out.println("Informe o código do produto ou Zero para sair");
			codigoProduto = entrada.nextInt();

			if(codigoProduto==0){break;}

			if(codigoProduto%2 == 0){
				for(int i=8; i>=1; i--){
					if(codigoProduto%i == 0){
						System.out.println("Armazenar na gaveta "+i+" do lado par");
						break;
					}
				}
			}else{
				for(int i=8; i>=1; i--){
					if(codigoProduto%i == 0){
						System.out.println("Armazenar na gaveta "+i+" do lado impar");
						break;
					}
				}
			}

		}while (codigoProduto != 0);
	}
}