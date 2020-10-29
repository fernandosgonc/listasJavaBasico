package br.com.loiane.listas.aula27;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {

		Aluno al = new Aluno();

		al.disciplinas = new String[] { "PT", "EN", "AL" };
		al.notas = new double[al.disciplinas.length][3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < al.disciplinas.length; i++) {
			System.out.println("Entre com a notas da disciplina " + al.disciplinas[i]);
			for (int j = 0; j < al.notas[i].length; j++) {
				al.notas[i][j] = scan.nextDouble();
			}
		}

		System.out.println("Em qual(is) matéria(s) deseja verificar aprovação?");
		System.out.println("1 - PT\n2 - EN\n3 - AL\n4 - todas");

		int op = scan.nextInt();
		if (op >= 1 && op <= 3) {
			if (al.estaAprovado(op)) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		} else if (op == 4) {
			for (int i = 1; i < al.disciplinas.length+1; i++) {
				if (al.estaAprovado(i)) {

					System.out.println("Aprovado\n");
				} else {
					System.out.println("Reprovado\n");
				}

			}
		}else{
			if(op>4){
				System.out.println("Opção inválida.");
			}
		}
		
		scan.close();

		/*for (int i = 0; i < al.disciplinas.length; i++) {
			System.out.println(al.disciplinas[i]);
			for (int j = 0; j < al.notas[i].length; j++) {
				System.out.println(al.notas[i][j]);
			}
			System.out.println();
		}
*/
	}

}
