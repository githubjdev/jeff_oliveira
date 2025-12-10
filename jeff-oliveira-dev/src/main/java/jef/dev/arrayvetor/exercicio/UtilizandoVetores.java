package jef.dev.arrayvetor.exercicio;

public class UtilizandoVetores {

	// durante 14 dias você anotou quantos passaros visitaram o seu jardim
	// agora voce deseja uma estatistica para responder as perguntas
	// a. numero total de passaros
	// b. numero total de passaros na primeira semana
	// c. numero total de passaros na segunda semana

	public static void main(String[] args) {

		int[] passarosPorDia = { 2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1 };

		int totalPassaros = 0;
		int passarosPrimeira = 0;
		int passarosSegunda = 0;
		int diaSemana = 7;

		for (int i = 0; i < passarosPorDia.length; i++) {
			totalPassaros += passarosPorDia[i];
		}
		System.out.println(totalPassaros);

		for (int i = 0; i < diaSemana; i++) {
			passarosPrimeira += passarosPorDia[i];
		}
		
		System.out.println(passarosPrimeira);

		for (int i = diaSemana; i < passarosPorDia.length; i++) {
			passarosSegunda += passarosPorDia[i];
		}
		System.out.println(passarosSegunda);

	}
}