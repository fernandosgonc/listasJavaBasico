package br.com.loiane.listas.aula19;

import java.util.Random;

public class Onze {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		Random r = new Random();
		
		for(int j = 0; j<a.length; j++){
			a[j] = r.nextInt(100);
		}
		
		int soma = 0, cont = 0;
		for(int p:a){
			if(p%2!=0){
				soma+=p;
				cont++;
			}
			System.out.print(p+" ");
		}
		
		System.out.println("\n"+soma);
		System.out.println("\n"+cont);
		System.out.println("\n"+soma/cont);
		System.out.println("\n"+soma%cont);
		
		System.out.println("% Impar: "+(cont*100)/a.length);
		System.out.println("% Par: " + (100-((cont*100)/a.length)));
	}
}
