package jef.dev.arrayvetor;

public class Ex1 {
	
	public static void main(String[] args) {
		
		
		int[] notas = new int[5];
		
		notas[0] = 80;
		notas[1] = 90;
		notas[2] = 60;
		
		for (int n : notas) {
			System.out.println(n);
		}
		
		
		System.out.println("Valor Atual: " + notas[1]);
		
		notas[1] = 55;
		
		
		System.out.println("Valor modificado: " + notas[1]);
		
		
		
		String[] nomes = {"Ana","Pedro", "Lucas", "Alex"};
		
		
		for (String n : nomes) {
			System.out.println(n);
		}
		
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Valor: " + nomes[i]);
		}
		
		
	}

}
