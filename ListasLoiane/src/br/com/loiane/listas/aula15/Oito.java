package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Oito {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as dimens�es: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		boolean eTriangulo = false;
		if((a+b>c) && (b+c>a) && (c+a>b)){
			eTriangulo = true;
		}
		
		String tipo = "N�o � um tri�ngulo";
		if(eTriangulo){
			if(a==b && b==c){
				tipo = "Equil�tero";
			}else if((a==b)||(b==c)||(c==a)){
				tipo = "Is�sceles";
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
