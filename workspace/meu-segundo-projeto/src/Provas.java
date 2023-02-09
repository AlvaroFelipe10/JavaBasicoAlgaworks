
public class Provas {
	
	int nota1;
	int nota2;
	int nota3;
	int Media;
	
	boolean reprovado() {
		return Media < 7;
	}
	
	boolean aprovado() {
		return Media >= 7;
	}
}
