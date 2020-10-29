package br.com.loiane.listas.aula17;

import java.util.Scanner;

public class Dezoito {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//int valor = scan.nextInt();
		int extremidade = scan.nextInt();
		scan.close();

		int totalPrimos = 0;
		for (int j = 1; j < extremidade; j++) {
			int i = 1, cont = 0;
			// int result;
			while (i <= j) {
				// result = valor/i;
				if (j % i == 0) { //colocando a variável valor de volta ele verifica se UM numero é primo ou n
					cont++;
					System.out.println("Valor/i ------ " + j + "/" + i);
				}
				i++;
			}

			if (cont > 2) {
				System.out.println("não é primo, " + cont);
			} else {
				totalPrimos++;
				System.out.println("é primo");
			}
		}
		
		System.out.println("Total primos: "+totalPrimos);

	}

}