package br.com.loiane.listas.aula36;

import java.util.Scanner;

public class CursoTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Professor prof1 = new Professor();
		prof1.setNome("Marcos Reis");
		prof1.setEmail("marcos@ifba.com.br");
		prof1.setDepartamento("Biologia");
		
		Aluno[] alunos = new Aluno[2];
		for(int k = 0; k<alunos.length; k++){
			Aluno al = new Aluno();
			System.out.println("Nome "+(k+1));
			al.setNome(scan.next());
			System.out.println("Matricula "+(k+1));
			al.setMatricula(scan.next());
			System.out.println("Notas aluno "+(k+1));
			
			double[] notas = new double[4];
			for(int j = 0; j<al.getNotas().length; j++){
				System.out.println("Nota "+(j+1));
				notas[j] = scan.nextDouble();
			}
			al.setNotas(notas);
			alunos[k] = al;
			
		}
	
		Curso curso1 = new Curso();
		curso1.setNome("Entomologia Básica");
		curso1.setHorario("Ter 14:00 - 17:00h");
		curso1.setProfessor(prof1);
		curso1.setAlunos(alunos);
		
		System.out.println(curso1.toString());
		scan.close();
		
	}
	
}
