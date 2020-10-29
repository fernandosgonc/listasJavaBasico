package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Um {
	public static void main(String[] args) {
		System.out.println("Digite dois números: ");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		scan.close();
		
		double maior = a;
		if(b>a){
			maior = b;
		}
		
		System.out.printf("O maior valor e %.3f", maior);
	}

}
