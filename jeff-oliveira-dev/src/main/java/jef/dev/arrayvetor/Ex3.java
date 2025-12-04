package jef.dev.arrayvetor;

import java.math.BigDecimal;

public class Ex3 {
	
	public static void main(String[] args) {
		double[] notas = new double[4];
		
		notas[0] = 60.80;
		notas[1] = 80.0;
		notas[2] = 30.45;
		notas[3] = 56.87;
		
		
		
		double total = 0;
		
		for (double n : notas) {
			total += n;
		}
		
		double media = total / notas.length;
		
		System.out.println("Média = " + media);
		
		
	}

}
