package br.com.loiane.listas.aula20;

import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {

		String[][] agenda = new String[31][24];

		inserirEvento(agenda);
		inserirEvento(agenda);

	}

	private static void inserirEvento(String[][] agenda) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o dia");
		int dia = scan.nextInt();
		System.out.println("Insira a hora");
		int hora = scan.nextInt();

		String evento;

		if (agenda[dia][hora] == null) {
			System.out.println("Insira o evento");

			evento = scan.next();
			agenda[dia][hora] = evento;

		} else {
			System.out.println("Horário ocupado");
			System.out.println("Deseja alterar?");
			int op = scan.nextInt();
			switch (op) {
			case 1:
				evento = scan.next();
				agenda[dia][hora] = evento;
				break;
			case 2:
				break;
			default:
				break;
			}
		}

		imprime(agenda);
		scan.close();
	}

	private static void imprime(String[][] agenda) {
		for (int i = 0; i < agenda.length; i++) {
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.print(agenda[i][j] + " ");
			}
			System.out.println();
		}
	}

}
