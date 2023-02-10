
public class Pessoa1 {
	String nome;
	int idade;
	
	Pessoa1(String nome){
		this.nome = nome;
		//inicializaçao bem complicada de fazer...
	}
	
	Pessoa1(String nome, int idade){
		this(nome); //Deve ser a primeira instrução dentro do construtor
		this.idade = idade;
	} 
	
}
	

