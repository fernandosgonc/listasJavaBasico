package br.com.loiane.listas.aula17;

import java.util.Scanner;

public class Dez {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		int i = a+1;
		int soma = 0;
		while(i<b){
			System.out.printf("%d ",i);
			soma+=i;
			i++;
			
		}
		System.out.printf("Soma: %d", soma);
	}

}
