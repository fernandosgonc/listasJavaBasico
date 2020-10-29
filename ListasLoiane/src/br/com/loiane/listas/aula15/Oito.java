package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Oito {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as dimensões: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		boolean eTriangulo = false;
		if((a+b>c) && (b+c>a) && (c+a>b)){
			eTriangulo = true;
		}
		
		String tipo = "Não é um triângulo";
		if(eTriangulo){
			if(a==b && b==c){
				tipo = "Equilátero";
			}else if((a==b)||(b==c)||(c==a)){
				tipo = "Isósceles";
			}else if((a!=b) && (b!=c) && (c!=a)){
				tipo = "Escaleno";
			}
			
			System.out.printf("%s", tipo);
		}else{
			System.out.printf("%s", tipo);
		}
		
		
		
		scan.close();
	}

}
