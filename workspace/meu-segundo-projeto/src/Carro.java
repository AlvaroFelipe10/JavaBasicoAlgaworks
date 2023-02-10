
public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario dono;
	
	void alterarModelo(String modelo) {
		if(modelo != null) {
			this.modelo = modelo;
		}
	}
	
	void ligar() {
		System.out.println("Ligando carro :" + modelo);
	}
	
}
