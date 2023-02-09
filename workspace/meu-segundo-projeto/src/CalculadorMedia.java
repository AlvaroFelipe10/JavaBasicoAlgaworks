
public class CalculadorMedia {
	Provas calcular(Aluno aluno) {
		Provas p = new Provas();
		p.Media = (aluno.nota1 + aluno.nota2 + aluno.nota3) /3;
		p.nota1 = aluno.nota1;
		p.nota2 = aluno.nota2;
		p.nota3 = aluno.nota3;	
		
			return p;
		
	}
	
	
	

}
