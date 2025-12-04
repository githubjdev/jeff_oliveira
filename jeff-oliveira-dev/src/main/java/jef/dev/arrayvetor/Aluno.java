package jef.dev.arrayvetor;

public class Aluno {

	String nome;

	int idade;

	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public void mostrar() {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
	}

}
