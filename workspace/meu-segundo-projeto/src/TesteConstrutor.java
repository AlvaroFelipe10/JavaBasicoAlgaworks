
public class TesteConstrutor {
	public static void main(String[] args) {
		Pessoa1 p1 = new Pessoa1("Alvaro");
		System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos");
		
		Pessoa1 p2 = new Pessoa1("Medina", 30);
		System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos");
	}
}
