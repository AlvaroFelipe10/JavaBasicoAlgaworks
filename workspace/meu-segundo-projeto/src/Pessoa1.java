
public class Pessoa1 {
	String nome;
	int idade;
	
	Pessoa1(String nome){
		this.nome = nome;
		//inicializa�ao bem complicada de fazer...
	}
	
	Pessoa1(String nome, int idade){
		this(nome); //Deve ser a primeira instru��o dentro do construtor
		this.idade = idade;
	} 
	
}
	

