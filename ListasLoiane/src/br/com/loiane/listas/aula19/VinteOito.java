package br.com.loiane.listas.aula19;

import java.util.Random;

public class VinteOito {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		int[] b = new int[10];
		
		for(int i = 0; i<a.length; i++){
			Random r = new Random();
			a[i] = r.nextInt(20);
		}
		
		int i = 0;
		for(int j = a.length-1; j>=0; j--){
			b[j] = a[i];
			i++;
		}
		
		
		for(int A:a){
			System.out.print(A+" ");
		}
		System.out.println("\n\n");
		for(int B:b){
			System.out.print(B+" ");
		}
	}
}
