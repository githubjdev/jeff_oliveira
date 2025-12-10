package jef.dev.arrayvetor.exercicio;

public class Exemplo10 {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Ana", "Paulo", "Amanda", "Julia", "Arthur"};
		
		for (String nome : nomes) {
			if (nome.toLowerCase().endsWith("r".toLowerCase())) {
				System.out.println("Enncontrado: " + nome);
			}
		}
	}

}
