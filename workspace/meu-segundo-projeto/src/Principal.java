
public class Principal {
	
	public static void main(String [] args) {
	Carro meuCarro = new Carro();
	meuCarro.modelo = "Up";
	meuCarro.anoDeFabricacao = 2015;
	meuCarro.cor = "Branco";
	
	Carro seuCarro = new Carro();
	seuCarro.modelo = "Palio";
	seuCarro.anoDeFabricacao = 2015;
	seuCarro.cor = "Branco";
	
	System.out.println("Meu carro");
	System.out.println("-------------------");
	System.out.println("Modelo: " + meuCarro.modelo);
	System.out.println("Ano: " + meuCarro.anoDeFabricacao);
	
	System.out.println();
	System.out.println("Seu carro");
	System.out.println("---------------------");
	System.out.println("Modelo: " + seuCarro.modelo);
	System.out.println("Ano: " + seuCarro.anoDeFabricacao);
	}
}