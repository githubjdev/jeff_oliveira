package jef.dev.arrayvetor;

public class Aluno {

	String nome;
	int idade;

	double[] notas = new double[4];

	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public void mostrar() {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double[] getNotas() {
		return notas;
	}
	
	
	public double soma() {
		double soma = 0.0;

		for (double d : notas) {
			soma += d;
		}

		return soma;
	}

	public double media() {
		double soma = 0.0;

		for (double d : notas) {
			soma += d;
		}

		return soma / notas.length;
	}

	public String notas() {

		String retorno = "Nota do Aluno: \n";

		for (double n : notas) {
			retorno += n + "\n";
		}

		return retorno;
	}

}
