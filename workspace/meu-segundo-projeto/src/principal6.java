
public class principal6{
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alvaro", 27);
		Aluno a2 = new Aluno("Medina", 30);
		CalculadorMedia calculadoraMedia = new CalculadorMedia();
		int media = calculadoraMedia.calculaMedia(10, 8, 7);
		int media2 = calculadoraMedia.calculaMedia(8, 8, 7);
		
		System.out.println("O aluno " + a1.nome + " ficou com a media: " + media);
		System.out.println("O aluno " + a2.nome + " ficou com a media: " + media2);
		CalculadorMedia mediaAluno = new CalculadorMedia();
		int mediaSala = mediaAluno.mediaSala(8, 7);
		System.out.println("A media da sala foi: " + mediaSala);
	}
}
