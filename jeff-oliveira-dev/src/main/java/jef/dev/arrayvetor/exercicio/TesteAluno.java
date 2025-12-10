package jef.dev.arrayvetor.exercicio;

import java.util.Scanner;

import jef.dev.arrayvetor.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno("Alex", 38);
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Informe a anota: " + i );
			aluno.getNotas()[i - 1 ] = scanner.nextDouble();
		}
		
		System.out.println(aluno.notas());
		System.out.println("Média: " + aluno.media());

	}

}
