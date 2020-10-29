package br.com.loiane.listas.aula17;

import java.util.Scanner;

public class VinteETres {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtd = scan.nextInt();
		scan.close();
		
		double valor  = 1.99, result = 0;
		for(int i = 1; i<=50; i++){
			result = i*valor;
			System.out.printf("%d -- R$%.2f%n", i, result);
		}
		
		System.out.println("Valor: "+(qtd*valor));
	}

}
