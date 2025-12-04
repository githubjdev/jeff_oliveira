package jef.dev.arrayvetor;

public class Ex4 {
	
	public static void main(String[] args) {
		
		
		Aluno[] alunos = new Aluno[3];
		
		alunos[0] = new Aluno("Alex", 38);
		alunos[1] = new Aluno("Paulo", 50);
		alunos[2] = new Aluno("José", 18);
		
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i].mostrar();
		}
		
		
		System.out.println("----------------------------------");
		alunos[2].mostrar();
		
	}

}
