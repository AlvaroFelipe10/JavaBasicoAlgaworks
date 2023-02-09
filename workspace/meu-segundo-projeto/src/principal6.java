
public class principal6 {
	public static void main(String[] args) {
		CalculadorMedia calculadorMedia = new CalculadorMedia();
		
		Aluno alvaro = new Aluno();
		alvaro.nota1 = 10;
		alvaro.nota2 = 9;
		alvaro.nota3 = 5;
		
		Provas p = calculadorMedia.calcular(alvaro);
		
		if(p.aprovado()) {
			System.out.println("O Aluno " + "Alvaro " + "tirou: " + p.Media);
		}
	}

}
