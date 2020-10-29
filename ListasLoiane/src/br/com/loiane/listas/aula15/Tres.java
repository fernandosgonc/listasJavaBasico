package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		System.out.println("Digite tres números: ");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		
		double maior = a;
		if(b>a){
			maior = b;
			if(c>b){
				maior = c;
			}
		}else if(c>a){
			maior = c;
			if(b>c){
				maior = b;
			}
		}
		
		System.out.printf("O maior é %f", maior);
	}

}
