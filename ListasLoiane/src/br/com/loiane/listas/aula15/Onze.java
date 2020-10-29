package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Onze {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("digite");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		System.out.println("escolha a operação: ");
		System.out.println("1 - +\n2 - -\n3 - *\n 4 - /");
		
		int op = scan.nextInt();
		scan.close();
		double r = 0;
		if(op==1){
			r = a+b;
		}else if(op == 2){
			r = a-b;
		}else if(op == 3){
			r = a*b;
		}else if(op == 4){
			r = a/b;
		}else{
			System.out.println("Inválido");
		}
		System.out.println(r);
		
		
		if( r > 0){
			System.out.println("Positivo");
		}else{
			System.out.println("Negativo");
		}
		
		if(r % 2 == 0){
			System.out.println("par");
		}else{
			System.out.println("impar");
		}
		
		
		
	}


}
