
public class PetShop {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		cachorro.nome = "Dudu";
		cachorro.idade = 2;
		cachorro.raca = "Bulldog";
		cachorro.sexo = 'M';
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
		
	}
}
