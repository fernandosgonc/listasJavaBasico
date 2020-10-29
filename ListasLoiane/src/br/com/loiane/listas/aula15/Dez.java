package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Dez {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ano = scan.nextInt();
		scan.close();
		
		boolean bissexto = false;
		if(ano%4==0){
			bissexto = true;
		}else{
			if(ano%400 == 0){
				bissexto = true;
			}
		}
		
		System.out.println(bissexto);
		}
	}

