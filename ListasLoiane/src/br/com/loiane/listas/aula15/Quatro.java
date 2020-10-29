package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Quatro {

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
		
		
		
		double menor = a;
		if(b<a){
			menor = b;
			if(c<menor){
				menor = c;
			}
		}else if(c<a){
			menor = c;
			if(b<menor){
				menor = b;
			}
		}
		
		System.out.printf("O maior é %f", maior);
		System.out.printf("O menor é %f", menor);
	}

}
