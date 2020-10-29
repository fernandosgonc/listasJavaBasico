package br.com.loiane.listas.aula17;

import java.util.Scanner;

public class Onze {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		scan.close();
		
		int i = 1, result;
		while(i<=10){
			result = valor*i;
			System.out.printf("%d X %d = %d%n", valor, i, result);
			i++;
		}
		
	}

}
