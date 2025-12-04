package jef.dev.arrayvetor;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] valores = new int[3];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor na posição: " + i);
			valores[i] = sc.nextInt();
		}
		
		
		int soma = 0;
		for (int v : valores) {
			soma += v;
		}
	
		
		System.out.println("Soma: " + soma);
		
		
		
		
		int base = valores[0];
		
		for (int n : valores) {
			if (n > base) {
				base = n;
			}
		}
		
		System.out.println("Maior valor: " + base);
		
		
		int menor = valores[0];
		for (int n : valores) {
			if (n < menor) {
				menor = n;
			}
		}
		
		System.out.println("Menor valor: " + menor);
		
		
		
		
		
	}

}
